package br.edu.infnet.AppInstrumentos.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.AppInstrumentos.model.domain.Cliente;

@Controller
public class ClienteController {
	
	private static Integer id = 1;
	private static Map<Integer, Cliente> mapaClientes = new HashMap<Integer, Cliente>();
	
	@GetMapping(value = "/cliente/lista")
	public String telaLista(Model model) {
				
		model.addAttribute("listagem", getLista());
		return "cliente/lista";
	}
	
	@GetMapping(value = "/cliente/{id}/excluir")
	public String telaExcluir(@PathVariable int id) {
		excluir(id);
		return "redirect:/cliente/lista";
	}
	
	public static Collection<Cliente> getLista(){
		return mapaClientes.values();
	}
	
	public static void adicionar(Cliente cliente) {
		cliente.setId(id++);
		mapaClientes.put(cliente.getId(), cliente);
	}
	
	public static void excluir(int id) {
		mapaClientes.remove(id);
	}
	
	
}
