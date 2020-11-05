package com.innowise.darya.repositoty;

import com.innowise.darya.dto.AuthorDTO;
import com.innowise.darya.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Long> {

    Author findByAuthorId(Long authorId);


}
