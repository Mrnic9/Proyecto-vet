package com.example.CrudSpringBoot.service;

import com.example.CrudSpringBoot.interfaceService.IDoctorService;
import com.example.CrudSpringBoot.interfaces.IDoctor;
import com.example.CrudSpringBoot.modelo.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService implements IDoctorService {

    @Autowired
    private IDoctor data;

    @Override
    public List<Doctor> listar() {
        return (List<Doctor>) data.findAll();
    }

    @Override
    public Optional<Doctor> listarId(int id) {

        return data.findById(id);
    }

    @Override
    public int save(Doctor p) {
        int res = 0;
        Doctor doctor = data.save(p);
        if(!doctor.equals(null)){
            res = 1;
        }
        return res;
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);
    }
}
