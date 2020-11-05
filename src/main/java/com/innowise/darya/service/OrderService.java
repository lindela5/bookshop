package com.innowise.darya.service;

import com.innowise.darya.dto.OrderDTO;
import com.innowise.darya.dto.SupplyDTO;
import com.innowise.darya.entity.Order;


public interface OrderService {

   // Order getOrderStats(Long orderId);

    OrderDTO getOrderById(long id);

    OrderDTO saveOrder(OrderDTO orderDto);

    void deleteOrder(long oderId);


}
