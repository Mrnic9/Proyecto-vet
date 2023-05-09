package com.example.CrudSpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PropietarioService implements IPropietarioService {

    @Autowired
    private IPropietario data;

    @Override
    public List<Propietario> listar() {
        return (List<Propietario>) data.findAll();
    }

    @Override
    public Optional<Propietario> listarId(int id) {

        return data.findById(id);
    }

    @Override
    public int save(Propietario p) {
        int res = 0;
        Propietario Propietario = data.save(p);
        if(!Propietario.equals(null)){
            res = 1;
        }
        return res;
    }
    @Override
    public void delete(int id) {
        data.deleteById(id);
    }
}
