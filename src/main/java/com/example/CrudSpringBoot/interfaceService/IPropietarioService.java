package com.example.CrudSpringBoot.interfaceService;

import com.example.CrudSpringBoot.modelo.Propietario;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication(scanBasePackages = {"com.example.CrudSpringBoot"})
public interface IPropietarioService {
    public List<Propietario> listar();
    public Optional<Propietario> listarId(int id);
    public int save (Propietario p);
    public void delete(int id);
}