package br.edu.infnet.AppInstrumentos.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.AppInstrumentos.model.domain.Instrumento;


@Controller
public class InstrumentoController {
	
	private static Map<Integer, Instrumento> mapaInstrumentos = new HashMap<Integer, Instrumento>();
	private static Integer id = 1;
	
	@GetMapping(value = "/instrumento/lista")
	public String telaLista(Model model) {
				
		model.addAttribute("listagem", getLista());
		return "instrumento/lista";
	}
	
	@GetMapping(value = "/instrumento/{id}/excluir")
	public String telaExcluir(@PathVariable int id) {
		excluir(id);
		return "redirect:/instrumento/lista";
	}
	
	public static Collection<Instrumento> getLista(){
		return mapaInstrumentos.values();
	}
	
	public static void adicionar(Instrumento instrumento) {
		instrumento.setId(id++);
		mapaInstrumentos.put(instrumento.getId(), instrumento);
	}
	
	public static void excluir(int id) {
		mapaInstrumentos.remove(id);
	}
}
