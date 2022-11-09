package br.edu.AppInstrumentos.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.AppInstrumentos.model.domain.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer>{

}
