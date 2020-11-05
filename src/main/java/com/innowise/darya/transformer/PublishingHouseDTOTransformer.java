package com.innowise.darya.transformer;

import com.innowise.darya.dto.PublishingHouseDTO;
import com.innowise.darya.entity.PublishingHouse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PublishingHouseDTOTransformer {
    PublishingHouseDTOTransformer PUBLISHING_HOUSE_DTO_TRANSFORMER = Mappers.getMapper(PublishingHouseDTOTransformer.class);

    @Mappings({
            @Mapping(target = "publishingHouseId", source = "entity.publishingHouseId"),
            @Mapping(target = "publisherName", source = "entity.namePublisher"),
            @Mapping(target = "publisherAddress", source = "entity.address")
    })
    PublishingHouseDTO publishingHouseToPublishingHouseDTO(PublishingHouse entity);

    @Mappings({
            @Mapping(target = "publishingHouseId", source = "dto.publishingHouseId"),
            @Mapping(target = "namePublisher", source = "dto.publisherName"),
            @Mapping(target = "address", source = "dto.publisherAddress")
    })
    PublishingHouse publishingHouseDTOToPublishingHouse(PublishingHouseDTO dto);
}
