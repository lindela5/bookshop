package com.innowise.darya.service;

import com.innowise.darya.dto.AuthorDTO;
import com.innowise.darya.entity.Author;
import com.innowise.darya.exception.ThereIsNoSuchException;
import com.innowise.darya.repositoty.AuthorRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.only;

@ExtendWith(MockitoExtension.class)
class AuthorServiceTest {

    @Mock //создаем заглушку (или макет)
    AuthorRepository authorRepository;

    @InjectMocks //создает экземпляр класса и внедряет @Mock созданные с @Mock (или @Spy) в этот экземпляр
    AuthorService authorService;

    private static final Long WRONG_ID = 8L;
    static final Long ID = 6L;
    static final String FIRST_NAME = "Agatha";
    static final String LAST_NAME = "Christie";
    static final String COUNTRY = "United Kingdom";

    //@formatter=off

    static final Author AUTHOR =
            Author.builder()
                    .authorId(ID)
                    .firstName(FIRST_NAME)
                    .lastName(LAST_NAME)
                    .country(COUNTRY)
                    .build();
    //@formatter=on


    @Test
    public void shouldThrowAuthorException() {
        given(authorRepository.findByAuthorId(WRONG_ID)).willReturn(null);
        assertThrows(ThereIsNoSuchException.class, () -> authorService.getAuthorById(WRONG_ID));
        then(authorRepository).should(only()).findByAuthorId(WRONG_ID);

    }


    @Test
    public void shouldReturnAuthorStat() {
        given(authorRepository.findByAuthorId(ID)).willReturn(AUTHOR);
        AuthorDTO actual = authorService.getAuthorById(ID);
        assertEquals(AUTHOR, actual);
        then(authorRepository).should(only()).findByAuthorId(ID);

    }

}