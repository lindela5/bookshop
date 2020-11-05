package com.innowise.darya.service;

import com.innowise.darya.dto.AuthorDTO;
import com.innowise.darya.dto.OrderDTO;
import com.innowise.darya.entity.Author;


public interface AuthorService {

    AuthorDTO getAuthorById(long id);

    AuthorDTO saveAuthor(AuthorDTO authorDto);

    void deleteAuthor(long authorId);

}

