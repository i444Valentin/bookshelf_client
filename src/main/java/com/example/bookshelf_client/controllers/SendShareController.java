package com.example.bookshelf_client.controllers;

import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextArea;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;

public class SendShareController {

    @FXML
    private JFXTextArea commentsField;

    @FXML
    private JFXRadioButton temporaryRadioButton;

    @FXML
    private ToggleGroup toDate;

    @FXML
    private JFXRadioButton permanentlyRadioButton;

    @FXML
    private DatePicker dateEndDatePicker;

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

    @FXML
    void buttonClick_sendShare(ActionEvent event) {

    }

}

