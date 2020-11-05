package com.innowise.darya.repositoty;

import com.innowise.darya.entity.Supply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplyRepository extends JpaRepository<Supply, String> {
    Supply findBySupplyId(Long supplyId);
}
