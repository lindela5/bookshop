package com.innowise.darya.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SupplierDTO {

    private Long id;
    private String supplierName;
    private String address;
    private String phone;
}
