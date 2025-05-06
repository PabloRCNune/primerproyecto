package com.example.primerproyecto.controllers;

import com.example.primerproyecto.entity.Alumno;
import com.example.primerproyecto.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class myController {



    @GetMapping("index")
    public String devuelveIndex(Model model) {

        Alumno alumno = new Alumno();
        alumno.setId((long)1);
        alumno.setNombre("Pablo");
        alumno.setApellido("Ponle arroba repository");

        model.addAttribute("alumno", alumno);

        System.out.println(alumno);

        return "index";
    }
}
