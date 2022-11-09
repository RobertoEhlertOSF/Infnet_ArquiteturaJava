package br.edu.infnet.AppInstrumentos.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.AppInstrumentos.model.domain.Instrumento;

@Service
public class InstrumentoService {
	
	private static Map<Integer, Instrumento> mapaInstrumentos = new HashMap<Integer, Instrumento>();
	private static Integer id = 1;
	
	public Collection<Instrumento> getLista(){
		return mapaInstrumentos.values();
	}
	
	public void adicionar(Instrumento instrumento) {
		instrumento.setId(id++);
		mapaInstrumentos.put(instrumento.getId(), instrumento);
	}
	
	public void excluir(int id) {
		mapaInstrumentos.remove(id);
	}

}
