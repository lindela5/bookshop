package com.innowise.darya.transformer;

import com.innowise.darya.dto.SectionDTO;
import com.innowise.darya.entity.Section;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.*;

class SectionDTOTransformerTest {

    static final SectionDTOTransformer SECTION_DTO_TRANSFORMER = Mappers.getMapper(SectionDTOTransformer.class);
    static final Long ID = 2L;
    static final String NAME_SECTION = "Fantasy";

    //@formatter=off
    static final SectionDTO SECTION_DTO =
            SectionDTO.builder()
                    .id(ID)
                    .nameSection(NAME_SECTION)
                    .build();

    static final Section SECTION =
            Section.builder()
                    .id(ID)
                    .nameSection(NAME_SECTION)
                    .build();
    //@formatter=on

    @Test
    public void shouldReturnSectionDTO() {

        Section section = SECTION_DTO_TRANSFORMER.sectionDTOToSection(SECTION_DTO);

        assertEquals(SECTION_DTO.getId(), section.getId());
        assertEquals(SECTION_DTO.getNameSection(), section.getNameSection());
    }

    @Test
    public void shouldReturnSection() {

        SectionDTO sectionDto = SECTION_DTO_TRANSFORMER.sectionToSectionDTO(SECTION);

        assertEquals(SECTION.getId(), sectionDto.getId());
        assertEquals(SECTION.getNameSection(), sectionDto.getNameSection());
    }
}