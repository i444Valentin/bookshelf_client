package com.example.bookshelf_client.controllers;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

public class AddBookController {

    @FXML
    private StackPane pane;

    @FXML
    private ImageView iconImage;

    @FXML
    private JFXTextField titleTextField;

    @FXML
    private JFXTextField authorTextField;

    @FXML
    private JFXTextField genreTextField;

    @FXML
    private JFXTextField pathToPdfTextField;

    @FXML
    void buttonClick_addImage(ActionEvent event) {

    }

    @FXML
    void buttonClick_addPdf(ActionEvent event) {

    }

    @FXML
    void buttonClick_closeWindow(ActionEvent event) {
        pane.setVisible(false);
    }

    @FXML
    void buttonClick_sendNewBook(ActionEvent event) {

    }

}
