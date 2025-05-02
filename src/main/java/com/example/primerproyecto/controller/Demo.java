package com.example.primerproyecto.controller;

import com.example.primerproyecto.entity.Empleado;
import com.example.primerproyecto.repo.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("alterno")
public class Demo {
	@Autowired
	EmpleadoRepository empleadoRepository ;


	@GetMapping("/")
	public String index(Model model) {
		Empleado empleados=empleadoRepository.findByNombreIs("paco");

		model.addAttribute("emp",empleados);
		model.addAttribute("numerofavorito",24);

		return "externo/index";
	}

	@GetMapping("/prueba")
	public String pepe() {
		return "externo/prueba/pepe";
	}

	@GetMapping("/datos")
	public String datos() {
		return "externo/prueba/pepe2";
	}
}
