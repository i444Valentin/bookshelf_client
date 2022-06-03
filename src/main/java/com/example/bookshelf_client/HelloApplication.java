package com.example.bookshelf_client;

import com.example.bookshelf_client.api.BookClient;
import com.example.bookshelf_client.pojo.Book;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("fxmls/welcome.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://127.0.0.1:8080/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        BookClient bookClient = retrofit.create(BookClient.class);
        Call<Book> response = bookClient.getAllBooks();

        Response<Book> response1 = response.execute();
        Book book = response1.body();
        System.out.println(response1.errorBody().string());


    }

    public static void main(String[] args) {
        launch();
    }
}