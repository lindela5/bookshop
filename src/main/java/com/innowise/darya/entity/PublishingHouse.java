package com.innowise.darya.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "publishing_house")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PublishingHouse {

    @Id
    private Long publishingHouseId;
    private String namePublisher;
    private String address;



}
