package com.example.bookshelf_client.pojo;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    Long id;
    String name;
    String email;
    String password;
    Boolean status;
    LocalDate birthDate;
    String country;
    List<ShortPOJO> shelves;
    List<ShortPOJO> books;
    List<ShortPOJO> shares;
    List<ShortPOJO> myShares;
}
