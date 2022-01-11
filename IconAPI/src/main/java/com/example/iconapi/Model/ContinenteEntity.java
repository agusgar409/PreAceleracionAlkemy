package com.example.iconapi.Model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
//@Table()
public class ContinenteEntity {

    @Id
    private Integer id;
}
