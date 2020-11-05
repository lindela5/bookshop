package com.innowise.darya.transformer;

import com.innowise.darya.dto.AuthorDTO;
import com.innowise.darya.dto.SectionDTO;
import com.innowise.darya.entity.Author;
import com.innowise.darya.entity.Section;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SectionDTOTransformer {
    SectionDTOTransformer SECTION_DTO_TRANSFORMER = Mappers.getMapper(SectionDTOTransformer.class);

    @Mappings({
            @Mapping(target = "id", source = "entity.id"),
            @Mapping(target = "nameSection", source = "entity.nameSection")

    })
    SectionDTO sectionToSectionDTO(Section entity);

    @InheritInverseConfiguration
    Section sectionDTOToSection(SectionDTO dto);
}
