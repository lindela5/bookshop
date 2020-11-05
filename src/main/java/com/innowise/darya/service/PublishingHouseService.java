package com.innowise.darya.service;

import com.innowise.darya.entity.PublishingHouse;
import com.innowise.darya.exception.ThereIsNoSuchException;
import com.innowise.darya.repositoty.PublishingHouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


public interface PublishingHouseService {

    PublishingHouse getPublisherStats(Long publishingHouseId);
}
