package com.example.bookshelf_client.controllers;

import com.example.bookshelf_client.HelloApplication;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.DatePicker;

import java.io.IOException;
import java.util.Objects;

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

    @FXML
    void buttonClick_goBack(ActionEvent event) throws IOException {
        captchaTextField.getScene().setRoot(FXMLLoader.load(Objects.requireNonNull(HelloApplication.class.getResource("fxmls/welcome.fxml"))));
    }

}
