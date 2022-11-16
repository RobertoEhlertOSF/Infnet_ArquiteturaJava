package br.edu.infnet.AppInstrumentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.AppInstrumentos.model.domain.Usuario;
import br.edu.infnet.AppInstrumentos.service.UsuarioService;

@Controller
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping(value = "/usuario/lista")
	public String telaLista(Model model) {
				
		model.addAttribute("listagem", usuarioService.getLista());
		return "usuario/lista";
	}
	
	@PostMapping(value = "/usuario/adicionar")
	public String adicionar(Usuario usuario) {
		usuarioService.adicionar(usuario);
		return "redirect:/usuario/lista";
	}
	
	@GetMapping(value = "/usuario/{id}/excluir")
	public String telaExcluir(@PathVariable int id) {
		usuarioService.excluir(id);
		return "redirect:/usuario/lista";
	}	
	
	@PostMapping(value = "/cep")
	public String obterCep(Model model, @RequestParam String cep) {
		model.addAttribute("endereco", usuarioService.obterCep(cep));
		
		
		return "usuario/cadastro";
	}
	
}
