package com.innowise.darya.service;

import com.innowise.darya.dto.AuthorDTO;
import com.innowise.darya.dto.BookDTO;
import com.innowise.darya.entity.Book;
import com.innowise.darya.entity.Section;


import java.util.List;
import java.util.Set;


public interface BookService {

    List<BookDTO> getAllBooks();

    BookDTO getBookById(long id);

    Set<AuthorDTO> getAuthorByYear(String year);

    BookDTO saveBook(BookDTO bookDto);

    void deleteBook(long bookId);

//    List<BookDTO> getAllBooksBySection(long id);
        List<BookDTO> getBySection(long id);

}

