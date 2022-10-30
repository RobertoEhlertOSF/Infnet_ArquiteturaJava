package br.edu.infnet.AppInstrumentos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AtabaqueController {
	
	@GetMapping(value = "/atabaque/lista")
	public String telaLista() {
		return "atabaque/lista";
	}
}
