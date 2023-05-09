package com.example.CrudSpringBoot.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Mascota")
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    long id;
    private int id_animal;
    private int id_Propietario;
    private String especie;
    private String raza;
    private String color;
    private int peso;
    private  int edad;

    public Mascota( long id ,int id_animal, int id_Propietario, String especie, String raza, String color, int peso, int edad) {
        this.id_animal = id_animal;
        this.id_Propietario = id_Propietario;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.peso = peso;
        this.edad = edad;
        this.id=id;
    }

    public Mascota() {
        super();
    }
}
