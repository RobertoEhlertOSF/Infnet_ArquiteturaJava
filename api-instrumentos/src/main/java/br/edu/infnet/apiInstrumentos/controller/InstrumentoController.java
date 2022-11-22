package br.edu.infnet.apiInstrumentos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.apiInstrumentos.domain.Atabaque;
import br.edu.infnet.apiInstrumentos.domain.Bateria;
import br.edu.infnet.apiInstrumentos.domain.Violao;
import br.edu.infnet.apiInstrumentos.service.InstrumentoService;

public class InstrumentoController {

	@Autowired
	InstrumentoService instrumentoService;
	@PostMapping(value = "/adicionar")
	public void insert(@RequestBody Object object) {
		instrumentoService.adicionar(object);
	}	
	@DeleteMapping(value = "/{id}/delete")
	public void delete(@PathVariable Integer id) {
		instrumentoService.delete(id);
	}
	@GetMapping(value = "/atabaque/listar")
	public List<Atabaque> listarAtabaque(){
		return instrumentoService.listarAtabaque();
	}
	@GetMapping(value = "/bateria/listar")
	public List<Bateria> listarBateria(){
		return instrumentoService.listarBateria();
	}
	@GetMapping(value = "/violao/listar")
	public List<Violao> listarViolao(){
		return instrumentoService.listarViolao();
	}
}
