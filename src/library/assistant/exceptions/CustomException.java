/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.assistant.exceptions;

import java.util.ArrayList;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.AnchorPane;
import library.assistant.alert.AlertMaker;

public class CustomException {

    public static class InsufficientDataException extends Exception {

        public InsufficientDataException(StackPane rootPane, AnchorPane mainContainer, String message) {
            super(message);
            AlertMaker.showMaterialDialog(rootPane, mainContainer, new ArrayList<>(), "Insufficient Data", message);
        }
    }
    
        public static class BookTitleTooLongException extends Exception {

        public BookTitleTooLongException(StackPane rootPane, AnchorPane mainContainer, String message) {
            super(message);
            AlertMaker.showMaterialDialog(rootPane, mainContainer, new ArrayList<>(), "Invalid Book Title", message);
        }
    }
}
