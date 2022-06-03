package com.example.bookshelf_client.controllers;

import com.example.bookshelf_client.HelloApplication;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.SubScene;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.Objects;

public class UserAccountController {

    @FXML
    private JFXButton searchButton;

    @FXML
    private JFXTextField bookTitleSearchTextField;

    @FXML
    private JFXListView<?> shelvesListView;

    @FXML
    private JFXListView<?> booksListView;

    @FXML
    private JFXButton newShelfButton;

    @FXML
    private JFXButton newBookButton;

    @FXML
    private JFXButton sharedBooksButton;

    @FXML
    private VBox userActionsVBox;

    @FXML
    private JFXButton mySharesButton;

    @FXML
    private SubScene content;


    @FXML
    void buttonClick_doAddNewShelf(ActionEvent event) throws IOException {
        content.setVisible(true);
        content.setManaged(false);
        content.setRoot(FXMLLoader.load(Objects.requireNonNull(HelloApplication.class.getResource("fxmls/add_shelf.fxml"))));
        content.setHeight(240);
        content.setWidth(426);
    }

    @FXML
    void buttonClick_doAddNewBook(ActionEvent event) throws IOException {
        content.setVisible(true);
        content.setManaged(false);
        content.setRoot(FXMLLoader.load(Objects.requireNonNull(HelloApplication.class.getResource("fxmls/add_book.fxml"))));
        content.setHeight(400);
        content.setWidth(600);
    }

    @FXML
    void buttonClick_openSharedBooks(ActionEvent event) {

    }

    @FXML
    void buttonClick_doOpenUser(ActionEvent event) {
        if (userActionsVBox.isVisible()) userActionsVBox.setVisible(false);
        else userActionsVBox.setVisible(true);
    }

    @FXML
    void buttonClick_doSearch(ActionEvent event) {

    }

    @FXML
    void buttonClick_logout(ActionEvent event) {
        userActionsVBox.setVisible(false);
    }

    @FXML
    void buttonClick_myShares(ActionEvent event) {
        userActionsVBox.setVisible(false);
    }

    @FXML
    void buttonClick_usersShares(ActionEvent event) {
        userActionsVBox.setVisible(false);
    }

}
