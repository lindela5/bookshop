package com.innowise.darya.transformer;

import com.innowise.darya.dto.OrderDTO;
import com.innowise.darya.entity.Order;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderDTOTransformer {
    OrderDTOTransformer ORDER_DTO_TRANSFORMER = Mappers.getMapper(OrderDTOTransformer.class);

    @Mappings({
            @Mapping(target = "orderId", source = "entity.orderId"),
            @Mapping(target = "bookOrder", source = "entity.bookOrder"),
            @Mapping(target = "customer", source = "entity.customer"),
            @Mapping(target = "orderDate", source = "entity.orderDate"),
            @Mapping(target = "amount", source = "entity.amount")
    })
    OrderDTO orderToOrderDTO(Order entity);

    @InheritInverseConfiguration
        //Аннотация определяет, что обратное отображение @InheritInverseConfiguration должно быть выполнено.
    Order orderDTOToOrder(OrderDTO dto);
}
