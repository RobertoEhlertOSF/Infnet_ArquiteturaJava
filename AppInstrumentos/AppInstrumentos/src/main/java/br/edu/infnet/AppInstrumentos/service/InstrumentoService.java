package br.edu.infnet.AppInstrumentos.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import br.edu.AppInstrumentos.model.repository.InstrumentoRepository;
import br.edu.infnet.AppInstrumentos.model.domain.Instrumento;

@Service
public class InstrumentoService {
	
	InstrumentoRepository instrumentoRepository;
	
	public Collection<Instrumento> getLista(){
		return (Collection<Instrumento>) instrumentoRepository.findAll();
	}

	public void adicionar(Instrumento instrumento) {
		instrumentoRepository.save(instrumento);
	}
	
	public void excluir(int id) {
		instrumentoRepository.deleteById(id);
	}
}
