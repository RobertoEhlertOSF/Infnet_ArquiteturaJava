package br.edu.infnet.AppInstrumentos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InstrumentoController {
	
	@GetMapping(value = "/instrumento/lista")
	public String telaLista() {
		return "instrumento/lista";
	}
}
