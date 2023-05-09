package com.example.CrudSpringBoot.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Propietario")
public class Propietario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    long id;
    private int id_cliente;
    private boolean existe;
   private String nameMasco;
   private int telefono;

   private String direccion;

   private String raza;
    private String FullName;

    public Propietario(long id, int id_cliente, boolean existe, String nameMasco, int telefono, String direccion, String raza, String fullName) {
        this.id = id;
        this.id_cliente = id_cliente;
        this.existe = existe;
        this.nameMasco = nameMasco;
        this.telefono = telefono;
        this.direccion = direccion;
        this.raza = raza;
        FullName = fullName;
    }

    public Propietario() {
        super();
    }
}

