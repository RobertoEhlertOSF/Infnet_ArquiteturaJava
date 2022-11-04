package br.edu.infnet.AppInstrumentos.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.AppInstrumentos.model.domain.Atabaque;
import org.springframework.ui.Model;


@Controller
public class AtabaqueController {	
	
	private static Integer id = 1;
	private static Map<Integer, Atabaque> mapaAtabaques = new HashMap<Integer, Atabaque>();
	
	@GetMapping(value = "/atabaque/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", getLista());
		return "atabaque/lista";
	}
	
	@GetMapping(value = "/atabaque/{id}/excluir")
	public String telaExcluir(@PathVariable int id) {
		excluir(id);
		return "redirect:/atabaque/lista";
	}
	
	public static Collection<Atabaque> getLista(){
		return mapaAtabaques.values();
	}
	
	public static void adicionar(Atabaque atabaque) {
		atabaque.setId(id++);
		mapaAtabaques.put(atabaque.getId(), atabaque);
	}
	
	public static void excluir(int id) {
		mapaAtabaques.remove(id);
	}
	
}
