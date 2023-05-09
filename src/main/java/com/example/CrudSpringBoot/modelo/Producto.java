package com.example.CrudSpringBoot.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    long id;
    private int id_producto;
    private String descripcion;
    private String categoria;
    private double precio;
    private int existencia;
    private boolean existe;

    //contructors
    public Producto( long id ,int id_producto, String descripcion, String categoria, double precio,  int existencia) {
        this.id_producto = id_producto;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precio = precio;
        this.existencia = existencia;
        this.existe = true;
        this.id=id;
    }

    public Producto() {
        super();
    }
}
