package com.innowise.darya.controller;

import com.innowise.darya.dto.PublishingHouseDTO;
import com.innowise.darya.entity.PublishingHouse;
import com.innowise.darya.service.PublishingHouseService;
import com.innowise.darya.transformer.PublishingHouseDTOTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/publishingHouse")
public class PublishingHouseController {

    private PublishingHouseService publishingHouseService;

    @Autowired
    public PublishingHouseController(PublishingHouseService publishingHouseService) {
        this.publishingHouseService = publishingHouseService;
    }

    @GetMapping(value = "{publishingHouseId}", produces = MediaType.APPLICATION_JSON_VALUE)


    public ResponseEntity<PublishingHouseDTO> getPublishingHouseStats(@PathVariable final Long publishingHouseId) {
        PublishingHouse publisher = publishingHouseService.getPublisherStats(publishingHouseId);
        PublishingHouseDTO publisherDTO = PublishingHouseDTOTransformer
                .PUBLISHING_HOUSE_DTO_TRANSFORMER.publishingHouseToPublishingHouseDTO(publisher);
        return ResponseEntity.ok(publisherDTO);
    }
}
