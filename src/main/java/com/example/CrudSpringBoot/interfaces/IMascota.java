package com.example.CrudSpringBoot.interfaces;

import com.example.CrudSpringBoot.modelo.Mascota;
import org.springframework.data.repository.CrudRepository;

public interface IMascota extends CrudRepository<Mascota, Integer> {
}
