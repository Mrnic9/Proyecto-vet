package com.example.CrudSpringBoot.controler;

import com.example.CrudSpringBoot.interfaceService.IDoctorService;
import com.example.CrudSpringBoot.modelo.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class ControlerDoctor {


    @Autowired
    private IDoctorService service;


    @GetMapping("/listardoc")
    public String listar(Model model){
        List<Doctor> personas= service.listar();
        model.addAttribute("personas", personas);
        return "factura";
    }

    @GetMapping("/new")
    public String agregar(Model model){
        model.addAttribute("persona", new Doctor());
        return "factura";
    }

    @PostMapping("/save")
    public String save(@Validated Doctor p){
        service.save(p);
        return "factura";
    }



    @GetMapping("/eliminar/{id}")
    public String delete(@PathVariable int id){
        service.delete(id);
        return "factura";
    }
}