package com.robcodes.graphqlprimer.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Post {
    @Id
    private Long id;
    private String title;
    private String text;
    private String category;
    private String authorId;

}