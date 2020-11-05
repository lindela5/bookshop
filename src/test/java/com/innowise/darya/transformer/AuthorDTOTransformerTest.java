package com.innowise.darya.transformer;

import com.innowise.darya.dto.AuthorDTO;
import com.innowise.darya.entity.Author;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AuthorDTOTransformerTest {

    static final AuthorDTOTransformer AUTHOR_DTO_TRANSFORMER = Mappers.getMapper(AuthorDTOTransformer.class);
    static final Long ID = 6L;
    static final String FIRST_NAME = "Agatha";
    static final String LAST_NAME = "Christie";
    static final String COUNTRY = "United Kingdom";


    //@formatter=off
    static final AuthorDTO AUTHOR_DTO =
            AuthorDTO.builder()
                    .authorId(ID)
                    .authorFirstName(FIRST_NAME)
                    .authorLastName(LAST_NAME)
                    .authorCountry(COUNTRY)
                    .build();

    static final Author AUTHOR =
            Author.builder()
                    .authorId(ID)
                    .firstName(FIRST_NAME)
                    .lastName(LAST_NAME)
                    .country(COUNTRY)
                    .build();
    //@formatter=on

    @Test
    public void shouldReturnAuthorDTO() {
        /*whenConvertAuthorDTOToAuthorThenCorrect*/
        Author author = AUTHOR_DTO_TRANSFORMER.authorDTOToAuthor(AUTHOR_DTO);

        assertEquals(AUTHOR_DTO.getAuthorId(), author.getAuthorId());
        assertEquals(AUTHOR_DTO.getAuthorFirstName(), author.getFirstName());
        assertEquals(AUTHOR_DTO.getAuthorLastName(), author.getLastName());
        assertEquals(AUTHOR_DTO.getAuthorCountry(), author.getCountry());
    }

    @Test
    public void shouldReturnAuthor() {

        AuthorDTO authorDto = AUTHOR_DTO_TRANSFORMER.authorToAuthorDTO(AUTHOR);

        assertEquals(AUTHOR.getAuthorId(), authorDto.getAuthorId());
        assertEquals(AUTHOR.getFirstName(), authorDto.getAuthorFirstName());
        assertEquals(AUTHOR.getLastName(), authorDto.getAuthorLastName());
        assertEquals(AUTHOR.getCountry(), authorDto.getAuthorCountry());

    }
}

