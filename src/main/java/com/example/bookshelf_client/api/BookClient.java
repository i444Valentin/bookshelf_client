package com.example.bookshelf_client.api;

import com.example.bookshelf_client.pojo.Book;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface BookClient {
    @POST("/books")
    Call<Book> addNewBook();

    @GET("/books")
    Call<Book> getAllBooks();
}
