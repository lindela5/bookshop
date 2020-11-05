package com.innowise.darya.transformer;

import com.innowise.darya.dto.SupplierDTO;
import com.innowise.darya.dto.SupplyDTO;
import com.innowise.darya.entity.Supplier;
import com.innowise.darya.entity.Supply;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SupplierDTOTransformer {
    SupplierDTOTransformer SUPPLIER_DTO_TRANSFORMER = Mappers.getMapper(SupplierDTOTransformer.class);

    @Mappings({
            @Mapping(target = "id", source = "entity.id"),
            @Mapping(target = "supplierName", source = "entity.supplierName"),
            @Mapping(target = "address", source = "entity.address"),
            @Mapping(target = "phone", source = "entity.phone")
    })
    SupplierDTO supplierToSupplierDTO(Supplier entity);

    @InheritInverseConfiguration
        //Аннотация определяет, что обратное отображение @InheritInverseConfiguration должно быть выполнено.
    Supplier supplierDTOToSupplier(SupplierDTO dto);
}
