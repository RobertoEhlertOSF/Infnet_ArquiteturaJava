package br.edu.infnet.AppInstrumentos.service;

import java.util.Collection;
import org.springframework.stereotype.Service;

import br.edu.AppInstrumentos.model.repository.BateriaRepository;
import br.edu.infnet.AppInstrumentos.model.domain.Bateria;

@Service
public class BateriaService {
	
	BateriaRepository bateriaRepository;
	
	public Collection<Bateria> getLista(){
		return (Collection<Bateria>) bateriaRepository.findAll();
	}
	
	public void adicionar(Bateria bateria) {
		bateriaRepository.save(bateria);
	}
	
	public void excluir(int id) {
		bateriaRepository.deleteById(id);
	}

}
