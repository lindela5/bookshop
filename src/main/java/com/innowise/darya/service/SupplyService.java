package com.innowise.darya.service;

import com.innowise.darya.dto.BookDTO;
import com.innowise.darya.dto.SupplyDTO;


public interface SupplyService {

    SupplyDTO getSupplyById(long id);

    SupplyDTO saveSupply(SupplyDTO supplyDto);

    void deleteSupply(long supplyId);

}
