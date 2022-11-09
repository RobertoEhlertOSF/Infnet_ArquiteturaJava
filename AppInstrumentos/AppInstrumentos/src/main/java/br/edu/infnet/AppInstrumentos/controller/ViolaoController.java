package br.edu.infnet.AppInstrumentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import br.edu.infnet.AppInstrumentos.service.ViolaoService;

@Controller
public class ViolaoController {
	
	@Autowired
	private ViolaoService violaoService;
	
	@GetMapping(value = "/violao/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", violaoService.getLista());
		return "violao/lista";
	}
	
	@GetMapping(value = "/violao/{id}/excluir")
	public String telaExcluir(@PathVariable int id) {
		violaoService.excluir(id);
		return "redirect:/violao/lista";
	}
}
