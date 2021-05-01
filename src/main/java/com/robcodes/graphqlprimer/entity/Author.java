package com.robcodes.graphqlprimer.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Author {
    @Id
    private Long id;
    private String name;
    private String thumbnail;

}