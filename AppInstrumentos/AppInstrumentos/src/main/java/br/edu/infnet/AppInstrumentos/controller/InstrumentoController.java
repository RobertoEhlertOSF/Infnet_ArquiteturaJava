package br.edu.infnet.AppInstrumentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.AppInstrumentos.service.InstrumentoService;


@Controller
public class InstrumentoController {
	
	@Autowired
	private InstrumentoService instrumentoService;
	
	@GetMapping(value = "/instrumento/lista")
	public String telaLista(Model model) {
				
		model.addAttribute("listagem", instrumentoService.getLista());
		return "instrumento/lista";
	}
	
	@GetMapping(value = "/instrumento/{id}/excluir")
	public String telaExcluir(@PathVariable int id) {
		instrumentoService.excluir(id);
		return "redirect:/instrumento/lista";
	}
	

}
