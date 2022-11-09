package br.edu.infnet.AppInstrumentos.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.AppInstrumentos.model.domain.Bateria;

@Service
public class BateriaService {
	
	private static Map<Integer, Bateria> mapaBaterias = new HashMap<Integer, Bateria>();
	private static Integer id = 1;
	
	public Collection<Bateria> getLista(){
		return mapaBaterias.values();
	}
	
	public void adicionar(Bateria bateria) {
		bateria.setId(id++);
		mapaBaterias.put(bateria.getId(), bateria);
	}
	
	public void excluir(int id) {
		mapaBaterias.remove(id);
	}

}
