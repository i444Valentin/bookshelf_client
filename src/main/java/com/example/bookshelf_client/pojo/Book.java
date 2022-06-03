package com.example.bookshelf_client.pojo;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private Long id;
    private String name;
    private String author;
    private String genre;
    private String content;
    private List<ShortPOJO> user;
    private Byte icon;
    private List<ShortPOJO> shares;
    private List<ShortPOJO> shelves;

}
