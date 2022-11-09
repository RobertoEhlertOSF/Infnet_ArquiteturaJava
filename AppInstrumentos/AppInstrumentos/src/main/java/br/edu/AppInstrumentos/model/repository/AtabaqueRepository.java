package br.edu.AppInstrumentos.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.AppInstrumentos.model.domain.Atabaque;

@Repository
public interface AtabaqueRepository extends CrudRepository<Atabaque, Integer>{

}
