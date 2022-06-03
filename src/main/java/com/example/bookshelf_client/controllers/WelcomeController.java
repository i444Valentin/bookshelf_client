package com.example.bookshelf_client.controllers;

import com.example.bookshelf_client.HelloApplication;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.Objects;

public class WelcomeController {

    @FXML
    private JFXTextField usernameTextField;

    @FXML
    private JFXPasswordField passwordField;

    @FXML
    void buttonClick_login(ActionEvent event) {

    }

    @FXML
    void buttonClick_newAccount(ActionEvent event) throws IOException {
        usernameTextField.getScene().setRoot(FXMLLoader.load(Objects.requireNonNull(HelloApplication.class.getResource("fxmls/registration.fxml"))));
    }

    @FXML
    void click_easterEggAbout(MouseEvent event) {

    }

}
