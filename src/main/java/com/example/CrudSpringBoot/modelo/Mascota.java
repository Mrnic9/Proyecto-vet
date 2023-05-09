package com.example.CrudSpringBoot.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Mascota")
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    long id;

    private int namepropietario;
    private String especie;
    private String raza;
    private String color;
    private int peso;
    private int edad;

    private String nameMas;
    private String sintomas;
    private String diagnostico;
}
