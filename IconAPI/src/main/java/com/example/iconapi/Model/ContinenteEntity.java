package com.example.iconapi.Model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
@Getter
@Setter
//@Table()
public class ContinenteEntity {

    @Id
    private Integer id;

    private String imagen;

    private String denominacion;

    private ArrayList<PaisEntity> paises = new ArrayList<>();
}
