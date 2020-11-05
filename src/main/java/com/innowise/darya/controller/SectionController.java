package com.innowise.darya.controller;

import com.innowise.darya.dto.SectionDTO;
import com.innowise.darya.entity.Section;
import com.innowise.darya.service.SectionService;
import com.innowise.darya.transformer.SectionDTOTransformer;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/section")
@Log
public class SectionController {
        private SectionService sectionService;

        @Autowired
        public SectionController(SectionService sectionService) {
            this.sectionService = sectionService;
        }

        @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)


        public ResponseEntity<SectionDTO> getSectionStats(@PathVariable final Long id) {
            Section section = sectionService.getSectionStats(id);
            log.info("Название секции - "+section.getNameSection());
            SectionDTO sectionDTO = SectionDTOTransformer.SECTION_DTO_TRANSFORMER.sectionToSectionDTO(section);
            return ResponseEntity.ok(sectionDTO);
        }
    }

