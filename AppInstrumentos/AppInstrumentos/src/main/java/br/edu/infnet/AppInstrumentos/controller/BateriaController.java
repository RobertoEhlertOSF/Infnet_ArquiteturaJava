package br.edu.infnet.AppInstrumentos.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.AppInstrumentos.model.domain.Bateria;

@Controller
public class BateriaController {
	private static Map<Integer, Bateria> mapaBaterias = new HashMap<Integer, Bateria>();
	private static Integer id = 1;
	
	@GetMapping(value = "/bateria/lista")
	public String telaLista(Model model) {
				
		model.addAttribute("listagem", getLista());
		return "bateria/lista";
	}
	
	@GetMapping(value = "/bateria/{id}/excluir")
	public String telaExcluir(@PathVariable int id) {
		excluir(id);
		return "redirect:/bateria/lista";
	}
	
	public static Collection<Bateria> getLista(){
		return mapaBaterias.values();
	}
	
	public static void adicionar(Bateria bateria) {
		bateria.setId(id++);
		mapaBaterias.put(bateria.getId(), bateria);
	}
	
	public static void excluir(int id) {
		mapaBaterias.remove(id);
	}
}
