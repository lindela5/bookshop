package com.innowise.darya.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "author")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Author {

    @Id
    private Long authorId;

    private String firstName;
    private String lastName;
    private String country;




}
