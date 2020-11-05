package com.innowise.darya.service;

import com.innowise.darya.entity.Section;
import com.innowise.darya.exception.ThereIsNoSuchException;
import com.innowise.darya.repositoty.SectionRepository;
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
class SectionServiceTest {

    @Mock //создаем заглушку (или макет)
    SectionRepository sectionRepository;

    @InjectMocks //создает экземпляр класса и внедряет @Mock созданные с @Mock (или @Spy) в этот экземпляр
    SectionService sectionService;

    private static final Long WRONG_ID = 8L;
    static final Long ID = 2L;
    static final String NAME_SECTION = "Fantasy";

    //@formatter=off

    static final Section SECTION =
            Section.builder()
                    .id(ID)
                    .nameSection(NAME_SECTION)
                    .build();
    //@formatter=on


    @Test
    public void shouldThrowSectionException() {
        given(sectionRepository.findById(WRONG_ID)).willReturn(null);
        assertThrows(ThereIsNoSuchException.class, () -> sectionService.getSectionStats(WRONG_ID));
        then(sectionRepository).should(only()).findById(WRONG_ID);

    }

    @Test
    public void shouldReturnSectionStat() {
        given(sectionRepository.findById(ID)).willReturn(SECTION);
        Section actual = sectionService.getSectionStats(ID);
        assertEquals(SECTION, actual);
        then(sectionRepository).should(only()).findById(ID);

    }

}