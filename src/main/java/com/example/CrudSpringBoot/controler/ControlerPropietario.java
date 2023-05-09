package com.example.CrudSpringBoot.controler;

import com.example.CrudSpringBoot.interfaceService.IPropietarioService;
import com.example.CrudSpringBoot.modelo.Propietario;
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
public class ControlerPropietario {


    @Autowired
    private IPropietarioService service;


    @GetMapping("/listar")
    public String listar(Model model){
        List<Propietario> propietarios= service.listar();
        model.addAttribute("propietario", propietarios);
        return "index";
    }

    @GetMapping("/new")
    public String agregar(Model model){
        model.addAttribute("propietario", new Propietario());
        return "form";
    }

    @PostMapping("/save")
    public String save(@Validated Propietario p){
        service.save(p);
        return "redirect:/listar";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model){
        Optional<Propietario> propietario = service.listarId(id);
        model.addAttribute("propietario", propietario);
        return "form";
    }

    @GetMapping("/eliminar/{id}")
    public String delete(@PathVariable int id){
        service.delete(id);
        return "redirect:/listar";
    }
}
