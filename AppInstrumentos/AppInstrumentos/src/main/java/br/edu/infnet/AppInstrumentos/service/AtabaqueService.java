package br.edu.infnet.AppInstrumentos.service;
import org.springframework.stereotype.Service;

import br.edu.AppInstrumentos.model.repository.AtabaqueRepository;
import br.edu.infnet.AppInstrumentos.model.domain.Atabaque;

@Service
public class AtabaqueService {	
	
	AtabaqueRepository atabaqueRepository;
		
	public Iterable<Atabaque> getLista(){
		return atabaqueRepository.findAll();
	}
	
	public void adicionar(Atabaque atabaque) {		
		atabaqueRepository.save(atabaque);
	}
	
	public void excluir(int id) {
		atabaqueRepository.deleteById(id);
	}

}
