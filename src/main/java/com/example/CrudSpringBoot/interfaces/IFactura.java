package com.example.CrudSpringBoot.interfaces;

import com.example.CrudSpringBoot.modelo.Factura;
import org.springframework.data.repository.CrudRepository;

public interface IFactura extends CrudRepository<Factura, Integer> {
}
