package br.edu.infnet.AppInstrumentos.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.AppInstrumentos.model.domain.Violao;

public class ViolaoService {
	
	private static Integer id = 1;
	private static Map<Integer, Violao> mapaVioloes = new HashMap<Integer, Violao>();
	
	public Collection<Violao> getLista(){
		return mapaVioloes.values();
	}
	
	public void adicionar(Violao violao) {
		violao.setId(id++);
		mapaVioloes.put(violao.getId(), violao);
	}
	
	public void excluir(int id) {
		mapaVioloes.remove(id);
	}

}
