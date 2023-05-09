package com.example.CrudSpringBoot.interfaceService;

import com.example.CrudSpringBoot.modelo.Mascota;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication(scanBasePackages = {"com.example.CrudSpringBoot"})
public interface IMascotaService {
    public List<Mascota> listar();
    public Optional<Mascota> listarId(int id);
    public int save (Mascota p);
    public void delete(int id);
}
