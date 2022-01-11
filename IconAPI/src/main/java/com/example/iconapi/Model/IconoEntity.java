package com.example.iconapi.Model;


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
//@Table()
public class IconoEntity {

    @Id
    private Integer id;

    private String imagen;

    private String denominacion;


    @Column(name = "fecha_creacion")
    @DateTimeFormat(pattern = "dd/mm/yyyy")
    private LocalDate fechaCreacion;

    private Integer altura;

    private String historia;

    private ArrayList<PaisEntity> paises = new ArrayList<>();
}
