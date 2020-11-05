package com.innowise.darya.transformer;

import com.innowise.darya.dto.SupplierDTO;
import com.innowise.darya.entity.Supplier;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SupplierDTOTransformerTest {

    static final SupplierDTOTransformer SUPPLIER_DTO_TRANSFORMER = Mappers.getMapper(SupplierDTOTransformer.class);
    static final Long ID = 1L;
    static final String SUPPLIER_NAME = "Perfect books";
    static final String ADDRESS = "14 Pinskaya Street, Gomel, Belarus";
    static final String PHONE = "+375291251256";


    //@formatter=off
    static final SupplierDTO SUPPLIER_DTO =
            SupplierDTO.builder()
                    .id(ID)
                    .supplierName(SUPPLIER_NAME)
                    .address(ADDRESS)
                    .phone(PHONE)
                    .build();

    static final Supplier SUPPLIER =
            Supplier.builder()
                    .id(ID)
                    .supplierName(SUPPLIER_NAME)
                    .address(ADDRESS)
                    .phone(PHONE)
                    .build();
    //@formatter=on

    @Test
    public void shouldReturnSupplierDTO() {

        Supplier supplier = SUPPLIER_DTO_TRANSFORMER.supplierDTOToSupplier(SUPPLIER_DTO);

        assertEquals(SUPPLIER_DTO.getId(), supplier.getId());
        assertEquals(SUPPLIER_DTO.getSupplierName(), supplier.getSupplierName());
        assertEquals(SUPPLIER_DTO.getAddress(), supplier.getAddress());
        assertEquals(SUPPLIER_DTO.getPhone(), supplier.getPhone());
    }

    @Test
    public void shouldReturnSupplier() {

        SupplierDTO supplierDto = SUPPLIER_DTO_TRANSFORMER.supplierToSupplierDTO(SUPPLIER);

        assertEquals(SUPPLIER.getId(), supplierDto.getId());
        assertEquals(SUPPLIER.getSupplierName(), supplierDto.getSupplierName());
        assertEquals(SUPPLIER.getAddress(), supplierDto.getAddress());
        assertEquals(SUPPLIER.getPhone(), supplierDto.getPhone());

    }
}
