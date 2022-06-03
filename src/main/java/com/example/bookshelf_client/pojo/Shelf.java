package com.example.bookshelf_client.pojo;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Shelf {
    Long id;
    String name;
    List<ShortPOJO> user;
    List<ShortPOJO> books;

}
