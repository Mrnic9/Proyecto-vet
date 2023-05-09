package com.example.CrudSpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacturaService implements IFacturaService {

    @Autowired
    private IFactura data;

    @Override
    public List<Factura> listar() {
        return (List<Factura>) data.findAll();
    }

    @Override
    public Optional<Factura> listarId(int id) {

        return data.findById(id);
    }

    @Override
    public int save(Factura p) {
        int res = 0;
        Factura factura = data.save(p);
        if(!factura.equals(null)){
            res = 1;
        }
        return res;
    }
    @Override
    public void delete(int id) {
        data.deleteById(id);
    }
}
