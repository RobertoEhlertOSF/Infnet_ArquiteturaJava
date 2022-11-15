package br.edu.AppInstrumentos.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.AppInstrumentos.model.domain.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer>{
	
	@Query("from solicitante s where s.usuario.id = :userId")
	List<Cliente> obterLista(Integer userId);
}
