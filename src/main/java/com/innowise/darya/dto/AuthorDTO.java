package com.innowise.darya.dto;

import com.innowise.darya.entity.Book;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthorDTO {

    private Long authorId;
    private String authorFirstName;
    private String authorLastName;
    private String authorCountry;
}
