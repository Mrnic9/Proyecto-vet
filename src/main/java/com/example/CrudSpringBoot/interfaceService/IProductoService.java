package com.example.CrudSpringBoot.interfaceService;

import com.example.CrudSpringBoot.modelo.Producto;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;
@SpringBootApplication(scanBasePackages = {"com.example.CrudSpringBoot"})
public interface IProductoService {
    public List<Producto> listar();
    public Optional<Producto> listarId(int id);
    public int save (Producto p);
    public void delete(int id);
}
