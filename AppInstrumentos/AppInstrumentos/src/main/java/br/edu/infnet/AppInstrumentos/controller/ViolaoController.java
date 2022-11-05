package br.edu.infnet.AppInstrumentos.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import br.edu.infnet.AppInstrumentos.model.domain.Violao;

@Controller
public class ViolaoController {
	
	private static Integer id = 1;
	private static Map<Integer, Violao> mapaVioloes = new HashMap<Integer, Violao>();
	
	@GetMapping(value = "/violao/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", getLista());
		return "violao/lista";
	}
	
	@GetMapping(value = "/violao/{id}/excluir")
	public String telaExcluir(@PathVariable int id) {
		excluir(id);
		return "redirect:/violao/lista";
	}
	
	public static Collection<Violao> getLista(){
		return mapaVioloes.values();
	}
	
	public static void adicionar(Violao violao) {
		violao.setId(id++);
		mapaVioloes.put(violao.getId(), violao);
	}
	
	public static void excluir(int id) {
		mapaVioloes.remove(id);
	}
}
