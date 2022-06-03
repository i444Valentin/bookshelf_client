package com.example.bookshelf_client.controllers;

import com.jfoenix.controls.JFXListView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class AddToShelfController {

    @FXML
    private JFXListView<?> shelvesView;

    @FXML
    private ImageView iconImage;

    @FXML
    private Label titleLabel;

    @FXML
    private Label authorLabel;

    @FXML
    private Label genreLabel;

    @FXML
    void buttonClick_closeWindow(ActionEvent event) {

    }

}
