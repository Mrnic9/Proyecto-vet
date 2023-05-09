package com.example.CrudSpringBoot.modelo;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Veterinario")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    long id;
    private String FullName;
    private int CC;

    private boolean existe;

    //constructor

    public Doctor(long id, String fullName, int CC, boolean existe) {
        this.id = id;
        this.FullName = fullName;
        this.CC = CC;
        this.existe = existe;
    }

    public Doctor() {
        super();
    }


}
