package com.example.CrudSpringBoot.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    long id;
    private  String name;
    private  String telefono;
    private String email;

    public Persona() {

    }

    public Persona(  long id,String name, String telefono, String email) {
        this.id = id;
        this.name = name;
        this.telefono = telefono;
        this.email=email;
    }



}
