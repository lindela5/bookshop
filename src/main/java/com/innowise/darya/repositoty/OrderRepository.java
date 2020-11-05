package com.innowise.darya.repositoty;

import com.innowise.darya.entity.Customer;
import com.innowise.darya.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.Set;

public interface OrderRepository extends JpaRepository<Order, String> {
    Order findByOrderId(Long orderId);

  /*  @Query("SELECT c from Order c WHERE c.customer.lastName = 'Semencova' and c.orderDate >= '2020-01-14'")
    Set<Order> findByCustomerAndOrderDate(String customer, LocalDate orderDate);*/

    Set<Order> findByCustomer(Customer customer);
}
