package com.example.CrudSpringBoot.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Factura")
public  class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    long id;
    private double fecha;
    private int id_vendedor;
    private String tipo;
    private  double precio;
    private  int cantidad;

    public Factura(long id, double fecha, int id_vendedor, String tipo, double precio, int cantidad) {
        this.id = id;
        this.fecha = fecha;
        this.id_vendedor = id_vendedor;
        this.tipo = tipo;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Factura() {
        super();
    }

}
