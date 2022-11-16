package br.edu.infnet.AppInstrumentos.service;

import java.util.Collection;

import br.edu.AppInstrumentos.model.repository.ClienteRepository;
import br.edu.infnet.AppInstrumentos.model.domain.Cliente;
import br.edu.infnet.AppInstrumentos.model.domain.Usuario;

public class ClienteService {	
	
	ClienteRepository clienteRepository;
	
	public Collection<Cliente> getLista(){
		return (Collection<Cliente>) clienteRepository.findAll();
	}
	
	public Collection<Cliente> getLista(Usuario usuario){
		return (Collection<Cliente>) clienteRepository.obterLista(usuario.getId());
	}
	
	public void adicionar(Cliente cliente) {
		clienteRepository.save(cliente);
	}
	
	public void excluir(int id) {
		clienteRepository.deleteById(id);
	}

}
