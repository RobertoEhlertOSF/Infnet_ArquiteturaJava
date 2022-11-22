package br.edu.infnet.apiInstrumentos.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.edu.infnet.apiInstrumentos.domain.Atabaque;
import br.edu.infnet.apiInstrumentos.domain.Bateria;
import br.edu.infnet.apiInstrumentos.domain.Violao;
import br.edu.infnet.apiInstrumentos.repository.AtabaqueRepository;
import br.edu.infnet.apiInstrumentos.repository.BateriaRepository;
import br.edu.infnet.apiInstrumentos.repository.InstrumentoRepository;
import br.edu.infnet.apiInstrumentos.repository.ViolaoRepository;

public class InstrumentoService {
	
	@Autowired
	InstrumentoRepository instrumentoRepository;
	
	@Autowired
	AtabaqueRepository atabaqueRepository;
	
	@Autowired
	BateriaRepository bateriaRepository;
	
	@Autowired
	ViolaoRepository violaoRepository;
	
	public void adicionar(Object object) {
		ObjectMapper mapObject = new ObjectMapper();
		
		Map<String,String> mapObj = mapObject.convertValue(object, Map.class);
		if(mapObj.get("isCouroArtificial")!= null) {
			atabaqueRepository.save(mapObject.convertValue(object, Atabaque.class));
		}
		else if(mapObj.get("isEletronica")!= null) {
			bateriaRepository.save(mapObject.convertValue(object, Bateria.class));
		}
		else {
			violaoRepository.save(mapObject.convertValue(object, Violao.class));
		}
	}
	public void delete(Integer id) {
		instrumentoRepository.deleteById(id);
	}
	
	public List<Atabaque> listarAtabaque(){
		return (List<Atabaque>) atabaqueRepository.findAll();		
	}
	
	public List<Bateria> listarBateria(){
		return (List<Bateria>) bateriaRepository.findAll();		
	}
	
	public List<Violao> listarViolao(){
		return (List<Violao>) violaoRepository.findAll();		
	}
}
