package br.edu.infnet.AppInstrumentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.AppInstrumentos.model.domain.Cliente;
import br.edu.infnet.AppInstrumentos.model.domain.Usuario;
import br.edu.infnet.AppInstrumentos.service.ClienteService;

@Controller
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@GetMapping(value = "/cliente/lista")
	public String telaLista(Model model) {
				
		model.addAttribute("listagem", clienteService.getLista());
		return "cliente/lista";
	}
	
	@GetMapping(value = "/cliente")
	public String telaCadastro() {
		return "cliente/cadastro";
	}
	
	@PostMapping(value = "/cliente/adicionar")
	public String adicionar(Cliente cliente, @SessionAttribute("user") Usuario usuario) {
		cliente.setUsuario(usuario);
		clienteService.adicionar(cliente);
		return "redirect:/cliente/lista";
	}
	
	@GetMapping(value = "/cliente/{id}/excluir")
	public String telaExcluir(@PathVariable int id) {
		clienteService.excluir(id);
		return "redirect:/cliente/lista";
	}	
}
