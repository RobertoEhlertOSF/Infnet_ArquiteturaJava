package br.edu.infnet.AppInstrumentos.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.AppInstrumentos.model.domain.Cliente;

public class ClienteService {	
	
	private static Integer id = 1;
	private static Map<Integer, Cliente> mapaClientes = new HashMap<Integer, Cliente>();
	
	public Collection<Cliente> getLista(){
		return mapaClientes.values();
	}
	
	public void adicionar(Cliente cliente) {
		cliente.setId(id++);
		mapaClientes.put(cliente.getId(), cliente);
	}
	
	public void excluir(int id) {
		mapaClientes.remove(id);
	}

}
