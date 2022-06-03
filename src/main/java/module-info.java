module com.example.bookshelf_client {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.jfoenix;
    requires lombok;
    requires retrofit2;
    requires retrofit2.converter.gson;
    requires okhttp3;

    exports com.example.bookshelf_client.controllers;
    exports com.example.bookshelf_client.pojo;
    opens com.example.bookshelf_client.pojo;
    opens com.example.bookshelf_client.api;
    exports com.example.bookshelf_client;
    opens com.example.bookshelf_client.controllers;

}