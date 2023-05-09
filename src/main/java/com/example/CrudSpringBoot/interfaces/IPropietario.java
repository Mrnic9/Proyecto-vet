package com.example.CrudSpringBoot.interfaces;

import com.example.CrudSpringBoot.modelo.Propietario;
import org.springframework.data.repository.CrudRepository;

public interface IPropietario extends CrudRepository<Propietario, Integer> {
}
