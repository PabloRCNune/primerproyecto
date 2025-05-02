package com.example.primerproyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("alterno")
public class Demo {
	@GetMapping("/")
	public String index() {
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
