package com.example.CrudSpringBoot.interfaceService;

import com.example.CrudSpringBoot.modelo.Factura;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication(scanBasePackages = {"com.example.CrudSpringBoot"})
public interface IFacturaService {
    public List<Factura> listar();
    public Optional<Factura> listarId(int id);
    public int save (Factura p);
    public void delete(int id);
}
