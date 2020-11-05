package com.innowise.darya.transformer;

import com.innowise.darya.dto.PublishingHouseDTO;
import com.innowise.darya.entity.PublishingHouse;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PublishingHouseDTOTransformerTest {

    static final PublishingHouseDTOTransformer PUBLISHING_HOUSE_DTO_TRANSFORMER = Mappers.getMapper(PublishingHouseDTOTransformer.class);
    static final Long ID = 4L;
    static final String NAME_PUBLISHER = "AST";
    static final String ADDRESS = "21 Zvezdny Boulevard, Ostankinsky, Moscow";

    //@formatter=off
    static final PublishingHouseDTO PUBLISHING_HOUSE_DTO =
            PublishingHouseDTO.builder()
                    .publishingHouseId(ID)
                    .publisherName(NAME_PUBLISHER)
                    .publisherAddress(ADDRESS)
                    .build();

    static final PublishingHouse PUBLISHING_HOUSE =
            PublishingHouse.builder()
                    .publishingHouseId(ID)
                    .namePublisher(NAME_PUBLISHER)
                    .address(ADDRESS)
                    .build();
    //@formatter=on

    @Test
    public void shouldReturnPublishingHouseDTO() {

        PublishingHouse publishingHouse = PUBLISHING_HOUSE_DTO_TRANSFORMER.publishingHouseDTOToPublishingHouse(PUBLISHING_HOUSE_DTO);

        assertEquals(PUBLISHING_HOUSE_DTO.getPublishingHouseId(), publishingHouse.getPublishingHouseId());
        assertEquals(PUBLISHING_HOUSE_DTO.getPublisherName(), publishingHouse.getNamePublisher());
        assertEquals(PUBLISHING_HOUSE_DTO.getPublisherAddress(), publishingHouse.getAddress());
    }

    @Test
    public void shouldReturnPublishingHouse() {

        PublishingHouseDTO publishingHouseDto = PUBLISHING_HOUSE_DTO_TRANSFORMER.publishingHouseToPublishingHouseDTO(PUBLISHING_HOUSE);

        assertEquals(PUBLISHING_HOUSE.getPublishingHouseId(), publishingHouseDto.getPublishingHouseId());
        assertEquals(PUBLISHING_HOUSE.getNamePublisher(), publishingHouseDto.getPublisherName());
        assertEquals(PUBLISHING_HOUSE.getAddress(), publishingHouseDto.getPublisherAddress());
    }
}