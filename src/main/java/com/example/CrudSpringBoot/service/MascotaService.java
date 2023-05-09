package com.example.CrudSpringBoot.service;

import com.example.CrudSpringBoot.interfaceService.IMascotaService;
import com.example.CrudSpringBoot.interfaces.IMascota;
import com.example.CrudSpringBoot.modelo.Mascota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MascotaService implements IMascotaService {

    @Autowired
    private IMascota data;

    @Override
    public List<Mascota> listar() {
        return (List<Mascota>) data.findAll();
    }

    @Override
    public Optional<Mascota> listarId(int id) {

        return data.findById(id);
    }

    @Override
    public int save(Mascota p) {
        int res = 0;
        Mascota mascota = data.save(p);
        if(!mascota.equals(null)){
            res = 1;
        }
        return res;
    }
    @Override
    public void delete(int id) {
        data.deleteById(id);
    }
}