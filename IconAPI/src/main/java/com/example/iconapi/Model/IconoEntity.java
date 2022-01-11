package com.example.iconapi.Model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
//@Table()
public class IconoEntity {

    @Id
    private Integer id;
}
