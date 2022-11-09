package br.edu.AppInstrumentos.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.AppInstrumentos.model.domain.Violao;

public interface ViolaoRepository extends CrudRepository<Violao, Integer> {

}
