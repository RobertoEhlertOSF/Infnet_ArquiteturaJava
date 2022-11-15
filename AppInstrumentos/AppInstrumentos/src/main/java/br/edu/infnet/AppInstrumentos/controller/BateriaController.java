package br.edu.infnet.AppInstrumentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.AppInstrumentos.model.domain.Bateria;
import br.edu.infnet.AppInstrumentos.service.BateriaService;

@Controller
public class BateriaController {
	
	@Autowired
	private BateriaService bateriaService;
	
	@GetMapping(value = "/bateria/lista")
	public String telaLista(Model model) {
				
		model.addAttribute("listagem", bateriaService.getLista());
		return "bateria/lista";
	}
	
	@GetMapping(value = "/bateria")
	public String telaCadastro() {
		return "bateria/cadastro";
	}
	
	
	@PostMapping(value = "/bateria/adicionar")
	public String adicionar(Bateria bateria) {
		bateriaService.adicionar(bateria);
		return "redirect:/bateria/lista";
	}
	
	
	@GetMapping(value = "/bateria/{id}/excluir")
	public String telaExcluir(@PathVariable int id) {
		bateriaService.excluir(id);
		return "redirect:/bateria/lista";
	}

}
