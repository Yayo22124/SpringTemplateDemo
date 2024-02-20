package com.spring.apimodelo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.spring.apimodelo.model.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@RestController
@RequestMapping("/lista")
public class ListaController {

    @GetMapping("/")
    public String getIndex() {
        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.add(new Usuario(UUID.randomUUID(), "Yayo", "Haziel Ortiz Ramírez"));
        usuarios.add(new Usuario(UUID.randomUUID(), "Mordo", "Irving Morales Domínguez"));
        usuarios.add(new Usuario(UUID.randomUUID(), "Romero", "Alejandro Romero Gonzalez"));
        usuarios.add(new Usuario(UUID.randomUUID(), "Mar", "Mariano Fajardo Islas"));
        usuarios.add(new Usuario(UUID.randomUUID(), "Carballo", "Carlos Carballo Canales"));

        

        return "index";
    }
}
