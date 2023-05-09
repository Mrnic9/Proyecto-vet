package com.example.CrudSpringBoot.controler;

import com.example.CrudSpringBoot.interfaceService.IFacturaService;
import com.example.CrudSpringBoot.modelo.Factura;
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
public class ControlerFactura {


    @Autowired
    private IFacturaService service;


    @GetMapping("/listar")
    public String listar(Model model){
        List<Factura>facturas= service.listar();
        model.addAttribute("facturas", facturas);
        return "index";
    }

    @GetMapping("/new")
    public String agregar(Model model){
        model.addAttribute("factura", new Factura());
        return "form";
    }

    @PostMapping("/save")
    public String save(@Validated Factura p){
        service.save(p);
        return "redirect:/listar";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model){
        Optional<Factura> factura = service.listarId(id);
        model.addAttribute("factura", factura);
        return "form";
    }

    @GetMapping("/eliminar/{id}")
    public String delete(@PathVariable int id){
        service.delete(id);
        return "redirect:/listar";
    }
}
