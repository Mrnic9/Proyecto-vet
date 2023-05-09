package com.example.CrudSpringBoot.controler;


import com.example.CrudSpringBoot.interfaceService.IProductoService;

import com.example.CrudSpringBoot.modelo.Producto;
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
public class ControlerProducto {




        @Autowired
        private IProductoService service;


        @GetMapping("/listar")
        public String listar(Model model){
            List<Producto> productos= service.listar();
            model.addAttribute("producto", productos);
            return "carrito";
        }

        @GetMapping("/new")
        public String agregar(Model model){
            model.addAttribute("prducto", new Producto());
            return "carrito";
        }

        @PostMapping("/save")
        public String save(@Validated Producto p){
            service.save(p);
            return "carrito";
        }

        @GetMapping("/editar/{id}")
        public String editar(@PathVariable int id, Model model){
            Optional<Producto> producto = service.listarId(id);
            model.addAttribute("producto", producto);
            return "carrito";
        }

        @GetMapping("/eliminar/{id}")
        public String delete(@PathVariable int id){
            service.delete(id);
            return "carrito";
        }

    }
