package br.edu.infnet.AppInstrumentos.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.AppInstrumentos.model.domain.Pedido;

@Service
public class PedidoService {	
	
	private static Map<Integer, Pedido> mapaPedidos = new HashMap<Integer, Pedido>();
	private static Integer id = 1;
	
	public Collection<Pedido> getLista(){
		return mapaPedidos.values();
	}
	
	public void adicionar(Pedido pedido) {
		pedido.setId(id++);
		mapaPedidos.put(pedido.getId(), pedido);
	}
	
	public void excluir(int id) {
		mapaPedidos.remove(id);
	}

}
