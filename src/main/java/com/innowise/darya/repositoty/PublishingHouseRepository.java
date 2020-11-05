package com.innowise.darya.repositoty;

import com.innowise.darya.entity.PublishingHouse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublishingHouseRepository extends JpaRepository<PublishingHouse,Long> {
    PublishingHouse findByPublishingHouseId(Long publishingHouseId);
}
