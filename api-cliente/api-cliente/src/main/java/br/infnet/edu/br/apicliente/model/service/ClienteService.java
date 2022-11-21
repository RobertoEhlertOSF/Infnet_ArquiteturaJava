package br.infnet.edu.br.apicliente.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.infnet.edu.br.apicliente.model.domain.Cliente;
import br.infnet.edu.br.apicliente.model.repository.ClienteRepository;


@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	public Collection<Cliente> listar(){
		return (Collection<Cliente>) clienteRepository.findAll();
	}
	
	public void adicionar(Cliente cliente) {
		clienteRepository.save(cliente);
	}
	
	public void excluir(int id) {
		clienteRepository.deleteById(id);
	}

}
