package com.innowise.darya.dto;

import com.innowise.darya.entity.Book;
import com.innowise.darya.entity.Supplier;
import com.innowise.darya.entity.Supply;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SupplyDTO {

    private Long supplyId;
    private Set<BookDTO> bookSupply;
    private Supplier supplier;
    private LocalDate supplyDate;
    private BigDecimal supplierPrice;

}