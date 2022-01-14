package com.example.iconapi.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "Characters")
public class CharacterEntity {

    @Id
    private Integer id;

    private String imagen;

    private String name;

    private Integer height;

    private String history;

    @ManyToMany(mappedBy = "charactereee")
    private List<MovieEntity> paises = new ArrayList<>();
}
