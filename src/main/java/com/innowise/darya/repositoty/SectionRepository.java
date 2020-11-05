package com.innowise.darya.repositoty;


import com.innowise.darya.entity.Section;
import org.springframework.data.jpa.repository.JpaRepository;



public interface SectionRepository extends JpaRepository<Section, String> {
    Section findById(Long id);


}
