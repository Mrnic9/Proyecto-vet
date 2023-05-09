package com.example.CrudSpringBoot.controler;

import com.example.CrudSpringBoot.interfaceService.IPersonaService;
import com.example.CrudSpringBoot.modelo.Persona;
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
public class ControlerPersona {


    @Autowired
    private IPersonaService service;


    @GetMapping("/listarper")
    public String listar(Model model){
        List<Persona> personas= service.listar();
        model.addAttribute("personas", personas);
        return "registro";
    }

    @GetMapping("/new")
    public String agregar(Model model){
        model.addAttribute("persona", new Persona());
        return "consulta";
    }

    @PostMapping("/save")
    public String save(@Validated Persona p){
        service.save(p);
        return "redirect:/listarper";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model){
        Optional<Persona> persona = service.listarId(id);
        model.addAttribute("persona", persona);
        return "registro";
    }

    @GetMapping("/eliminar/{id}")
    public String delete(@PathVariable int id){
        service.delete(id);
        return "consulta";
    }
}
