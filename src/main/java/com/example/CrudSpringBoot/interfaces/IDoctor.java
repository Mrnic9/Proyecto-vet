package com.example.CrudSpringBoot.interfaces;

import com.example.CrudSpringBoot.modelo.Doctor;
import org.springframework.data.repository.CrudRepository;

public interface IDoctor  extends CrudRepository<Doctor, Integer> {
}
