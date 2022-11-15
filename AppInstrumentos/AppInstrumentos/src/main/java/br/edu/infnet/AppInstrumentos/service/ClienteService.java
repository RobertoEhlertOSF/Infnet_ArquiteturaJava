package br.edu.infnet.AppInstrumentos.service;

import java.util.Collection;

import br.edu.AppInstrumentos.model.repository.ClienteRepository;
import br.edu.infnet.AppInstrumentos.model.domain.Cliente;

public class ClienteService {	
	
	ClienteRepository clienteRepository;
	
	public Collection<Cliente> getLista(){
		return (Collection<Cliente>) clienteRepository.findAll();
	}
	
	public void adicionar(Cliente cliente) {
		clienteRepository.save(cliente);
	}
	
	public void excluir(int id) {
		clienteRepository.deleteById(id);
	}

}
