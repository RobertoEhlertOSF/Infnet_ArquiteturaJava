package br.edu.infnet.AppInstrumentos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViolaoController {
	
	@GetMapping(value = "/violao/lista")
	public String telaLista() {
		return "violao/lista";
	}
}
