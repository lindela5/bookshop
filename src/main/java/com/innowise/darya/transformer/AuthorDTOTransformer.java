package com.innowise.darya.transformer;

import com.innowise.darya.dto.AuthorDTO;
import com.innowise.darya.entity.Author;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorDTOTransformer {
    AuthorDTOTransformer AUTHOR_DTO_TRANSFORMER = Mappers.getMapper(AuthorDTOTransformer.class);

    @Mappings({
            @Mapping(target = "authorId", source = "entity.authorId"),
            @Mapping(target = "authorFirstName", source = "entity.firstName"),
            @Mapping(target = "authorLastName", source = "entity.lastName"),
            @Mapping(target = "authorCountry", source = "entity.country")
    })
    AuthorDTO authorToAuthorDTO(Author entity);

    @InheritInverseConfiguration
    Author authorDTOToAuthor(AuthorDTO dto);
}
