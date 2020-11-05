package com.innowise.darya.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "supply")

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Supply {

    @Id
    private Long supplyId;

    @ManyToMany
    @JoinTable(name = "book_supply", joinColumns = @JoinColumn(name = "supplyId"),
            inverseJoinColumns = @JoinColumn(name = "bookId"))
    private Set<Book> bookSupply = new HashSet<>();

    @NotBlank
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="supplier_id")
    private Supplier supplier;

    private LocalDate supplyDate;
    private BigDecimal supplierPrice;

}
