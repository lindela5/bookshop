package com.innowise.darya.transformer;

import com.innowise.darya.dto.CustomerDTO;
import com.innowise.darya.entity.Customer;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerDTOTransformer {
    CustomerDTOTransformer CUSTOMER_DTO_TRANSFORMER = Mappers.getMapper(CustomerDTOTransformer.class);

    @Mappings({
            @Mapping(target = "customerId", source = "entity.customerId"),
            @Mapping(target = "firstName", source = "entity.firstName"),
            @Mapping(target = "lastName", source = "entity.lastName"),
            @Mapping(target = "address", source = "entity.address"),
            @Mapping(target = "phone", source = "entity.phone"),
            @Mapping(target = "email", source = "entity.email")
    })
    CustomerDTO customerToCustomerDTO(Customer entity);

    @InheritInverseConfiguration
    Customer customerDTOToCustomer(CustomerDTO dto);
}
