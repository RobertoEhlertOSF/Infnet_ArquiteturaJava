package br.edu.infnet.AppInstrumentos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.AppInstrumentos.model.domain.Cliente;

@Controller
public class ClienteController {
	
	@GetMapping(value = "/cliente/lista")
	public String telaLista(Model model) {
		
		Cliente c1 = new Cliente("11111111111", "roberto@aluno.com", "roberto");	
		Cliente c2 = new Cliente("22222222222", "professor@escola.com", "Professorson");
		Cliente c3 = new Cliente("3333333333", "diretor@escola.com", "Pelton");
		
		List<Cliente> clientes = new ArrayList();
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
		
		model.addAttribute("listagem", clientes);
		
		
		return "cliente/lista";
	}
}
