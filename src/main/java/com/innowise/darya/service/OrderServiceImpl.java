package com.innowise.darya.service;

import com.innowise.darya.dto.OrderDTO;
import com.innowise.darya.dto.SupplyDTO;
import com.innowise.darya.entity.Order;
import com.innowise.darya.entity.Supply;
import com.innowise.darya.exception.ThereIsNoSuchException;
import com.innowise.darya.repositoty.OrderRepository;
import com.innowise.darya.transformer.OrderDTOTransformer;
import com.innowise.darya.transformer.SupplyDTOTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;


//    @Override
//    public Order getOrderStats(Long orderId) {
//
//        Order order = orderRepository.findByOrderId(orderId);
//        if (order == null) {
//            throw new ThereIsNoSuchException("order");
//        }
//        return order;
//    }

    @Override
    public OrderDTO getOrderById(long id) {
        Optional<Order> orderOptional = Optional.ofNullable(orderRepository.findByOrderId(id));
        if (!orderOptional.isPresent()) {
            return null;
        }
        Order order = orderOptional.get();
        OrderDTO orderDTO = OrderDTOTransformer.ORDER_DTO_TRANSFORMER.orderToOrderDTO(order);
        return orderDTO;
    }

    @Override
    public OrderDTO saveOrder(OrderDTO orderDto) {
        Order savedOrder = orderRepository.save(OrderDTOTransformer.ORDER_DTO_TRANSFORMER.orderDTOToOrder(orderDto));
        return OrderDTOTransformer.ORDER_DTO_TRANSFORMER.orderToOrderDTO(savedOrder);
    }

    @Override
    public void deleteOrder(long orderId) {
        orderRepository.deleteById(String.valueOf(orderId));
    }
}
