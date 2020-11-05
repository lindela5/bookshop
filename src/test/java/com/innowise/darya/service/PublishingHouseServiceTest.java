package com.innowise.darya.service;

import com.innowise.darya.entity.PublishingHouse;
import com.innowise.darya.exception.ThereIsNoSuchException;
import com.innowise.darya.repositoty.PublishingHouseRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.only;

@ExtendWith(MockitoExtension.class)
class PublishingHouseServiceTest {

    @Mock //создаем заглушку (или макет)
    PublishingHouseRepository publishingHouseRepository;

    @InjectMocks //создает экземпляр класса и внедряет @Mock созданные с @Mock (или @Spy) в этот экземпляр
    PublishingHouseService publishingHouseService;

    private static final Long WRONG_ID = 8L;
    static final Long ID = 4L;
    static final String NAME_PUBLISHER = "AST";
    static final String ADDRESS = "21 Zvezdny Boulevard, Ostankinsky, Moscow";

    //@formatter=off

    static final PublishingHouse PUBLISHING_HOUSE =
            PublishingHouse.builder()
                    .publishingHouseId(ID)
                    .namePublisher(NAME_PUBLISHER)
                    .address(ADDRESS)
                    .build();
    //@formatter=on


    @Test
    public void shouldThrowPublishingHouseException() {
        given(publishingHouseRepository.findByPublishingHouseId(WRONG_ID)).willReturn(null);
        assertThrows(ThereIsNoSuchException.class, () -> publishingHouseService.getPublisherStats(WRONG_ID));
        then(publishingHouseRepository).should(only()).findByPublishingHouseId(WRONG_ID);

    }

    @Test
    public void shouldReturnPublishingHouseStat() {
        given(publishingHouseRepository.findByPublishingHouseId(ID)).willReturn(PUBLISHING_HOUSE);
        PublishingHouse actual = publishingHouseService.getPublisherStats(ID);
        assertEquals(PUBLISHING_HOUSE, actual);
        then(publishingHouseRepository).should(only()).findByPublishingHouseId(ID);

    }

}