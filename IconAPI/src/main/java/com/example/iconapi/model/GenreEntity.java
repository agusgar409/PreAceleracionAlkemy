package com.example.iconapi.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "Genre")
public class GenreEntity {

    @Id
    private Integer id;

    private String name;

    private String image;

    //private List<MovieEntity> movies = new ArrayList<>();
}
