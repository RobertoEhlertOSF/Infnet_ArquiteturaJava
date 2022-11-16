package br.edu.infnet.AppInstrumentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.AppInstrumentos.model.domain.Pedido;
import br.edu.infnet.AppInstrumentos.model.domain.Usuario;
import br.edu.infnet.AppInstrumentos.service.PedidoService;

@Controller
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;
	
	@GetMapping(value = "/pedido/lista")
	public String telaLista(Model model) {
				
		model.addAttribute("listagem", pedidoService.getLista());
		return "pedido/lista";
	}
	
	@GetMapping(value = "/pedido")
	public String telaCadastro() {
		return "pedido/cadastro";
	}
	
	@PostMapping(value = "/pedido/cadastrar")
	public String incluir(Pedido pedido, @SessionAttribute("user") Usuario usuario) {

		System.out.println("Clientes: " + pedido.getCliente());		
		System.out.println("Instrumentos: " + pedido.getInstrumentos());

		pedido.setUsuario(usuario);

		pedidoService.adicionar(pedido);

		return "redirect:/pedido/lista";
	}
	
	@GetMapping(value = "/pedido/{id}/excluir")
	public String telaExcluir(@PathVariable int id) {
		pedidoService.excluir(id);
		return "redirect:/pedido/lista";
	}
	

}
