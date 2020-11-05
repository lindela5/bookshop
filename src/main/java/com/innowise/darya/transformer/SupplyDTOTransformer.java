package com.innowise.darya.transformer;

import com.innowise.darya.dto.SupplyDTO;
import com.innowise.darya.entity.Supply;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SupplyDTOTransformer {
    SupplyDTOTransformer SUPPLY_DTO_TRANSFORMER = Mappers.getMapper(SupplyDTOTransformer.class);

    @Mappings({
            @Mapping(target = "supplyId", source = "entity.supplyId"),
            @Mapping(target = "bookSupply", source = "entity.bookSupply"),
            @Mapping(target = "supplier", source = "entity.supplier"),
            @Mapping(target = "supplyDate", source = "entity.supplyDate"),
            @Mapping(target = "supplierPrice", source = "entity.supplierPrice")
    })
    SupplyDTO supplyToSupplyDTO(Supply entity);

    @InheritInverseConfiguration
        //Аннотация определяет, что обратное отображение @InheritInverseConfiguration должно быть выполнено.
    Supply supplyDTOToSupply(SupplyDTO dto);
}

