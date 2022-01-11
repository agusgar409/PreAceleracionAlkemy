package com.example.iconapi.Model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
@Getter
@Setter
//@Table()
public class PaisEntity {

    @Id
    private Integer id;

    private String imagen;

    private String denominacion;

    @Column(name = "cantidad_habitantes")
    private Integer cantidadHabitantes;

    private Long superficie;

    private ArrayList<IconoEntity> iconos = new ArrayList<>();

}
