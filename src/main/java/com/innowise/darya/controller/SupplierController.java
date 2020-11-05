package com.innowise.darya.controller;

import com.innowise.darya.dto.SupplierDTO;
import com.innowise.darya.dto.SupplyDTO;
import com.innowise.darya.entity.Supplier;
import com.innowise.darya.entity.Supply;
import com.innowise.darya.service.SupplierService;
import com.innowise.darya.service.SupplyService;
import com.innowise.darya.transformer.SupplierDTOTransformer;
import com.innowise.darya.transformer.SupplyDTOTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/supplier")
public class SupplierController {
    private SupplierService supplierService;

    @Autowired
    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)


    public ResponseEntity<SupplierDTO> getSupplierStats(@PathVariable final Long id) {
        Supplier supplier = supplierService.getSupplierStats(id);
        SupplierDTO supplierDTO = SupplierDTOTransformer.SUPPLIER_DTO_TRANSFORMER.supplierToSupplierDTO(supplier);
        return ResponseEntity.ok(supplierDTO);
    }


}
