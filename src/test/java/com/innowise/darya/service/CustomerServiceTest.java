package com.innowise.darya.service;

import com.innowise.darya.entity.Customer;
import com.innowise.darya.exception.ThereIsNoSuchException;
import com.innowise.darya.repositoty.CustomerRepository;
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
class CustomerServiceTest {

    @Mock //создаем заглушку (или макет)
    CustomerRepository customerRepository;

    @InjectMocks //создает экземпляр класса и внедряет @Mock созданные с @Mock (или @Spy) в этот экземпляр
    CustomerService customerService;

    private static final Long WRONG_ID = 12L;
    static final Long ID = 5L;
    static final String FIRST_NAME = "Marya";
    static final String LAST_NAME = "Koshkina";
    static final String ADDRESS = "246000, Gomel, Katunin St. 86/33";
    static final String PHONE = "+375331488256";
    static final String EMAIL = "mama_koshka@gmail.com";

    //@formatter=off

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
    public void shouldThrowCustomerException() {
        given(customerRepository.findByCustomerId(WRONG_ID)).willReturn(null);
        assertThrows(ThereIsNoSuchException.class, () -> customerService.getCustomerStats(WRONG_ID));
        then(customerRepository).should(only()).findByCustomerId(WRONG_ID);

    }


    @Test
    public void shouldReturnCustomerStat() {
        given(customerRepository.findByCustomerId(ID)).willReturn(CUSTOMER);
        Customer actual = customerService.getCustomerStats(ID);
        assertEquals(CUSTOMER, actual);
        then(customerRepository).should(only()).findByCustomerId(ID);

    }

}