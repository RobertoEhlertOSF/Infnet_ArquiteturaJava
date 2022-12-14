package br.edu.infnet.AppInstrumentos.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.AppInstrumentos.model.domain.Atabaque;
import br.edu.infnet.AppInstrumentos.service.AtabaqueService;
import org.springframework.ui.Model;


@Controller
public class AtabaqueController {	
	
	@Autowired
	private AtabaqueService atabaqueService;
	
	@GetMapping(value = "/atabaque/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", atabaqueService.getLista());
		return "atabaque/lista";
	}
	
	@GetMapping(value = "/atabaque")
	public String telaCadastro() {
		return "atabaque/cadastro";
	}
	
	@PostMapping(value = "/atabaque/adicionar")
	public String adicionar(Atabaque atabaque) {
		atabaqueService.adicionar(atabaque);
		return "redirect:/cliente/lista";
	}
	
	@GetMapping(value = "/atabaque/{id}/excluir")
	public String telaExcluir(@PathVariable int id) {
		atabaqueService.excluir(id);
		return "redirect:/atabaque/lista";
	}
	
}
