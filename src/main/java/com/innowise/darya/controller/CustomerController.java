package com.innowise.darya.controller;

import com.innowise.darya.dto.CustomerDTO;
import com.innowise.darya.entity.Customer;
import com.innowise.darya.service.CustomerService;
import com.innowise.darya.transformer.CustomerDTOTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;



    @GetMapping(value = "{customerId}", produces = MediaType.APPLICATION_JSON_VALUE)


    public ResponseEntity<CustomerDTO> getCustomerStats(@PathVariable final Long customerId) {
        Customer customer = customerService.getCustomerStats(customerId);
        CustomerDTO customerDTO = CustomerDTOTransformer.CUSTOMER_DTO_TRANSFORMER.customerToCustomerDTO(customer);
        return ResponseEntity.ok(customerDTO);
    }




}
