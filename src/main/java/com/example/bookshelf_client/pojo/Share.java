package com.example.bookshelf_client.pojo;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Share {
    Long id;
    LocalDate dateEnd;
    String comment;
    Boolean status;
    List<ShortPOJO> book;
    List<ShortPOJO> receiver;
    List<ShortPOJO> owner;
}
