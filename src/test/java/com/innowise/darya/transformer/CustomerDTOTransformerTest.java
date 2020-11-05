package com.innowise.darya.transformer;

import com.innowise.darya.dto.CustomerDTO;
import com.innowise.darya.entity.Customer;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerDTOTransformerTest {

    static final CustomerDTOTransformer CUSTOMER_DTO_TRANSFORMER = Mappers.getMapper(CustomerDTOTransformer.class);
    static final Long ID = 5L;
    static final String FIRST_NAME = "Marya";
    static final String LAST_NAME = "Koshkina";
    static final String ADDRESS = "246000, Gomel, Katunin St. 86/33";
    static final String PHONE = "+375331488256";
    static final String EMAIL = "mama_koshka@gmail.com";

    //@formatter=off
    static final CustomerDTO CUSTOMER_DTO =
            CustomerDTO.builder()
                    .customerId(ID)
                    .firstName(FIRST_NAME)
                    .lastName(LAST_NAME)
                    .address(ADDRESS)
                    .phone(PHONE)
                    .email(EMAIL)
                    .build();

    static final Customer CUSTOMER =
            Customer.builder()
                    .customerId(ID)
                    .firstName(FIRST_NAME)
                    .lastName(LAST_NAME)
                    .address(ADDRESS)
                    .phone(PHONE)
                    .email(EMAIL)
                    .build();
    //@formatter=on

    @Test
    public void shouldReturnCustomerDTO() {

        Customer customer = CUSTOMER_DTO_TRANSFORMER.customerDTOToCustomer(CUSTOMER_DTO);

        assertEquals(CUSTOMER_DTO.getCustomerId(), customer.getCustomerId());
        assertEquals(CUSTOMER_DTO.getFirstName(), customer.getFirstName());
        assertEquals(CUSTOMER_DTO.getLastName(), customer.getLastName());
        assertEquals(CUSTOMER_DTO.getAddress(), customer.getAddress());
        assertEquals(CUSTOMER_DTO.getPhone(), customer.getPhone());
        assertEquals(CUSTOMER_DTO.getEmail(), customer.getEmail());
    }

    @Test
    public void shouldReturnCustomer() {

        CustomerDTO customerDto = CUSTOMER_DTO_TRANSFORMER.customerToCustomerDTO(CUSTOMER);

        assertEquals(CUSTOMER.getCustomerId(), customerDto.getCustomerId());
        assertEquals(CUSTOMER.getFirstName(), customerDto.getFirstName());
        assertEquals(CUSTOMER.getLastName(), customerDto.getLastName());
        assertEquals(CUSTOMER.getAddress(), customerDto.getAddress());
        assertEquals(CUSTOMER.getPhone(), customerDto.getPhone());
        assertEquals(CUSTOMER.getEmail(), customerDto.getEmail());

    }
}