package com.innowise.darya.transformer;

import com.innowise.darya.dto.AuthorDTO;
import com.innowise.darya.dto.BookDTO;
import com.innowise.darya.entity.Author;
import com.innowise.darya.entity.Book;
import com.innowise.darya.entity.PublishingHouse;
import com.innowise.darya.entity.Section;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import static com.innowise.darya.entity.Book.aBook;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BookDTOTransformerTest {

    static final BookDTOTransformer TRANSFORMER = Mappers.getMapper(BookDTOTransformer.class);
    static final Long ID = 2L;
    static final String BOOK_TITLE = "Good Omens";

    static final Long AUTHOR1_ID = 8L;
    static final Long AUTHOR2_ID = 9L;

    static final Author AUTHOR1 =
            Author.builder()
                    .authorId(AUTHOR1_ID)
                    .build();
    static final Author AUTHOR2 =
            Author.builder()
                    .authorId(AUTHOR2_ID)
                    .build();

    static final AuthorDTO AUTHOR1_DTO =
            AuthorDTO.builder()
                    .authorId(AUTHOR1_ID)
                    .build();
    static final AuthorDTO AUTHOR2_DTO =
            AuthorDTO.builder()
                    .authorId(AUTHOR2_ID)
                    .build();

    static final Set<Author> AUTHOR_BOOK = Set.of(
            AUTHOR1,
            AUTHOR2);

    static final Set<AuthorDTO> AUTHOR_BOOK_DTO = Set.of(
            AUTHOR1_DTO,
            AUTHOR2_DTO);

    static final String ISBN = "9781910281918";

    static final Long SECTION_ID = 8L;
    static final String NAME_SECTION = "Mystery";
    static final Section SECTION = Section.builder()
            .id(SECTION_ID)
            .nameSection(NAME_SECTION)
            .build();

    static final Integer YEAR_OF_ISSUE = Integer.valueOf("2015");

    static final Long PUBLISHER_ID = 8L;
    static final String NAME_PUBLISHER = "Mystery";
    static final PublishingHouse PUBLISHING_HOUSE = PublishingHouse.builder()
            .publishingHouseId(PUBLISHER_ID)
            .namePublisher(NAME_PUBLISHER)
            .build();

    static final BigDecimal PRICE = new BigDecimal(23.16);
    static final Integer STOCK_BALANCES = Integer.valueOf("1");


    //@formatter=off
    static final BookDTO BOOK_DTO =
            BookDTO.builder()
                    .bookId(ID)
                    .bookTitle(BOOK_TITLE)
                    .bookAuthor(AUTHOR_BOOK_DTO)
                    .isbn(ISBN)
                    .section(SECTION)
                    .yearOfIssue(YEAR_OF_ISSUE)
                    .publishingHouse(PUBLISHING_HOUSE)
                    .price(PRICE)
                    .stockBalances(STOCK_BALANCES)
                    .build();

    static final Book BOOK =
            aBook()
                    .bookId(ID)
                    .title(BOOK_TITLE)
                    .author(AUTHOR_BOOK)
                    .isbn(ISBN)
                    .section(SECTION)
                    .yearOfIssue(YEAR_OF_ISSUE)
                    .publishingHouse(PUBLISHING_HOUSE)
                    .price(PRICE)
                    .stockBalances(STOCK_BALANCES)
                    .build();
    //@formatter=on

    @Test
    public void shouldReturnBookEntityDTO() {

        BookDTO actual = TRANSFORMER.bookToBookDTO(BOOK);

        assertEquals(BOOK_DTO, actual);
    }

    @Test
    public void shouldReturnBookEntity() {

        Book book = TRANSFORMER.bookDTOToBook(BOOK_DTO);

        assertEquals(BOOK, book);

    }
}