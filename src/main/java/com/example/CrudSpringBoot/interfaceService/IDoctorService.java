package com.example.CrudSpringBoot.interfaceService;
import com.example.CrudSpringBoot.modelo.Doctor;
import com.example.CrudSpringBoot.modelo.Producto;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;
@SpringBootApplication(scanBasePackages = {"com.example.CrudSpringBoot"})
public interface IDoctorService {
    public List<Doctor> listar();
    public Optional<Doctor> listarId(int id);
    public int save (Doctor p);
    public void delete(int id);
}
