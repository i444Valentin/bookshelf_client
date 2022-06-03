package com.example.bookshelf_client.controllers;

import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;

public class RegistrationController {

    @FXML
    private JFXTextField usernameTextField;

    @FXML
    private JFXTextField emailTextField;

    @FXML
    private JFXTextField countryTextField;

    @FXML
    private JFXPasswordField passwordTextField;

    @FXML
    private JFXPasswordField confirmPasswordTextField;

    @FXML
    private JFXTextField captchaTextField;

    @FXML
    private DatePicker birthDateDatePicker;

    @FXML
    void buttonClick_createAccount(ActionEvent event) {

    }

}
