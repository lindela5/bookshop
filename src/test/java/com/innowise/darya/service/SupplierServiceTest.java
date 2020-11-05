package com.innowise.darya.service;

import com.innowise.darya.entity.Supplier;
import com.innowise.darya.exception.ThereIsNoSuchException;
import com.innowise.darya.repositoty.SupplierRepository;
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
class SupplierServiceTest {

    @Mock //создаем заглушку (или макет)
    SupplierRepository supplierRepository;

    @InjectMocks //создает экземпляр класса и внедряет @Mock созданные с @Mock (или @Spy) в этот экземпляр
    SupplierService supplierService;

    private static final Long WRONG_ID = 8L;
    static final Long ID = 1L;
    static final String SUPPLIER_NAME = "Perfect books";
    static final String ADDRESS = "14 Pinskaya Street, Gomel, Belarus";
    static final String PHONE = "+375291251256";

    //@formatter=off

    static final Supplier SUPPLIER =
            Supplier.builder()
                    .id(ID)
                    .supplierName(SUPPLIER_NAME)
                    .address(ADDRESS)
                    .phone(PHONE)
                    .build();
    //@formatter=on


    @Test
    public void shouldThrowSupplierException() {
        given(supplierRepository.findById(WRONG_ID)).willReturn(null);
        assertThrows(ThereIsNoSuchException.class, () -> supplierService.getSupplierStats(WRONG_ID));
        then(supplierRepository).should(only()).findById(WRONG_ID);

    }

    @Test
    public void shouldReturnSupplierStat() {
        given(supplierRepository.findById(ID)).willReturn(SUPPLIER);
        Supplier actual = supplierService.getSupplierStats(ID);
        assertEquals(SUPPLIER, actual);
        then(supplierRepository).should(only()).findById(ID);

    }

}