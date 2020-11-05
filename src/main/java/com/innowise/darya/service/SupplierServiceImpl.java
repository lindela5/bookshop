package com.innowise.darya.service;

import com.innowise.darya.entity.Supplier;
import com.innowise.darya.exception.ThereIsNoSuchException;
import com.innowise.darya.repositoty.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    private SupplierRepository supplierRepository;



    public Supplier getSupplierStats(Long id) {
        Supplier supplier = supplierRepository.findById(id);
        if (supplier == null) {
            throw new ThereIsNoSuchException("supplier");
        }
        return supplier;
    }
}
