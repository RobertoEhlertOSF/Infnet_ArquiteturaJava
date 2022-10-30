package br.edu.infnet.AppInstrumentos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BateriaController {
	
	@GetMapping(value = "/bateria/lista")
	public String telaLista() {
		return "bateria/lista";
	}
}
