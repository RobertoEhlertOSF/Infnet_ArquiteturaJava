package br.infnet.edu.br.apicliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.infnet.edu.br.apicliente.model.domain.Cliente;
import br.infnet.edu.br.apicliente.model.service.ClienteService;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;

	@PostMapping(value = "/adicionar")
	public void insert(@RequestBody Cliente cliente) {
		clienteService.adicionar(cliente);
	}	
	@DeleteMapping(value = "/{id}/excluir")
	public void delete(@PathVariable Integer id) {
		clienteService.excluir(id);
	}	

	@GetMapping(value = "/listarTodos")
	public List<Cliente> getList(){
		return (List<Cliente>) clienteService.listar();
	}
}
