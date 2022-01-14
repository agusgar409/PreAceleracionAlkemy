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
@Table(name = "Movies")
public class MovieEntity {

    @Id
    private Integer id;

    private String imagen;

    private String title;

    @Column(name = "creation_date")
    @DateTimeFormat(pattern = "dd/mm/yyyy")
    private LocalDate creationDate;

    private Long calification;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "genre_id")
    private GenreEntity genre_id;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.ALL})
    @JoinTable(
            name = "caractere",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "charactere_id")
    )
    private List<CharacterEntity> charactereee = new ArrayList<>();

}
