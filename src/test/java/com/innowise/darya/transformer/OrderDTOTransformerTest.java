package com.innowise.darya.transformer;

import com.innowise.darya.dto.BookDTO;
import com.innowise.darya.dto.CustomerDTO;
import com.innowise.darya.dto.OrderDTO;
import com.innowise.darya.dto.SupplierDTO;
import com.innowise.darya.entity.Book;
import com.innowise.darya.entity.Customer;
import com.innowise.darya.entity.Order;
import com.innowise.darya.entity.Supplier;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import static java.math.BigDecimal.TEN;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderDTOTransformerTest {

    static final OrderDTOTransformer ORDER_DTO_TRANSFORMER = Mappers.getMapper(OrderDTOTransformer.class);
    static final Long ID = 1L;
    static final Long BOOK1_ID = 2L;
    static final Long BOOK2_ID = 3L;
    static final Book BOOK1 =
            Book.aBook()
                    .bookId(BOOK1_ID)
                    .price(TEN)
                    .build();
    static final Book BOOK2 =
            Book.aBook()
                    .bookId(BOOK2_ID)
                    .price(TEN)
                    .build();

    static final BookDTO BOOK1_DTO =
            BookDTO.builder()
                    .bookId(BOOK1_ID)
                    .price(TEN)
                    .build();

    static final BookDTO BOOK2_DTO =
            BookDTO.builder()
                    .bookId(BOOK2_ID)
                    .price(TEN)
                    .build();

    static final Set<Book> BOOK_ORDER = Set.of(
            BOOK1,
            BOOK2);
    static final Set<BookDTO> BOOK_ORDER_DTO = Set.of(
            BOOK1_DTO,
            BOOK2_DTO);


    static final Long CUSTOMER_ID = 2L;
    static final String FIRST_NAME = "Volga";
    static final String LAST_NAME = "Semencova";
    static final String ADDRESS = "246000, Gomel, Lienin Ave 6/14";
    static final String PHONE = "+375336541212";
    static final String EMAIL = "volga_semencova@mail.ru";

    static final Customer CUSTOMER = Customer.builder()
            .customerId(CUSTOMER_ID)
            .firstName(FIRST_NAME)
            .lastName(LAST_NAME)
            .address(ADDRESS)
            .phone(PHONE)
            .email(EMAIL)
            .build();

    static final LocalDate ORDER_DATE = LocalDate.parse("2020-01-14");
    static final BigDecimal AMOUNT = new BigDecimal(213);

    //@formatter=off
    static final OrderDTO ORDER_DTO =
            OrderDTO.builder()
                    .orderId(ID)
                    .bookOrder(BOOK_ORDER_DTO)
                    .customer(CUSTOMER)
                    .orderDate(ORDER_DATE)
                    .amount(AMOUNT)
                    .build();

    static final Order ORDER =
            Order.builder()
                    .orderId(ID)
                    .bookOrder(BOOK_ORDER)
                    .customer(CUSTOMER)
                    .orderDate(ORDER_DATE)
                    .amount(AMOUNT)
                    .build();
    //@formatter=on

    @Test
    public void shouldReturnOrderDTO() {

        OrderDTO orderDto = ORDER_DTO_TRANSFORMER.orderToOrderDTO(ORDER);

        assertEquals(ORDER_DTO, orderDto);

    }

    @Test
    public void shouldReturnOrder() {

        Order order = ORDER_DTO_TRANSFORMER.orderDTOToOrder(ORDER_DTO);

        assertEquals(ORDER, order);
    }
}