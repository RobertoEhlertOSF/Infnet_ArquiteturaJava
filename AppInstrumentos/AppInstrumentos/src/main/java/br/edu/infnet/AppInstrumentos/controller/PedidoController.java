package br.edu.infnet.AppInstrumentos.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.AppInstrumentos.model.domain.Pedido;

@Controller
public class PedidoController {
	
	private static Map<Integer, Pedido> mapaPedidos = new HashMap<Integer, Pedido>();
	private static Integer id = 1;
	
	@GetMapping(value = "/pedido/lista")
	public String telaLista(Model model) {
				
		model.addAttribute("listagem", getLista());
		return "pedido/lista";
	}
	
	@GetMapping(value = "/pedido/{id}/excluir")
	public String telaExcluir(@PathVariable int id) {
		excluir(id);
		return "redirect:/pedido/lista";
	}
	
	public static Collection<Pedido> getLista(){
		return mapaPedidos.values();
	}
	
	public static void adicionar(Pedido pedido) {
		pedido.setId(id++);
		mapaPedidos.put(pedido.getId(), pedido);
	}
	
	public static void excluir(int id) {
		mapaPedidos.remove(id);
	}
}
