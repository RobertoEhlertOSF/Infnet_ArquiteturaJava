package br.edu.infnet.AppInstrumentos.service;

import java.util.Collection;
import org.springframework.stereotype.Service;

import br.edu.AppInstrumentos.model.repository.ViolaoRepository;
import br.edu.infnet.AppInstrumentos.model.domain.Violao;

@Service
public class ViolaoService {

	ViolaoRepository violaoRepository;
	
	public Collection<Violao> getLista(){
		return (Collection<Violao>) violaoRepository.findAll();
	}
	
	public void adicionar(Violao violao) {
		violaoRepository.save(violao);
	}
	
	public void excluir(int id) {
		violaoRepository.deleteById(id);
	}

}
