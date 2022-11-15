package br.edu.infnet.AppInstrumentos.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import br.edu.AppInstrumentos.model.repository.PedidoRepository;
import br.edu.infnet.AppInstrumentos.model.domain.Pedido;

@Service
public class PedidoService {	
	
	PedidoRepository pedidoRepository;
	
	public Collection<Pedido> getLista(){
		return (Collection<Pedido>) pedidoRepository.findAll();
	}
	
	public void adicionar(Pedido pedido) {
		pedidoRepository.save(pedido);
	}
	
	public void excluir(int id) {
		pedidoRepository.deleteById(id);
	}

}
