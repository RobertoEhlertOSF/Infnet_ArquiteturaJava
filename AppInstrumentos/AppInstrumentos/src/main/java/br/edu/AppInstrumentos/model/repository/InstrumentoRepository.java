package br.edu.AppInstrumentos.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.AppInstrumentos.model.domain.Instrumento;

@Repository
public interface InstrumentoRepository extends CrudRepository<Instrumento, Integer>{

	@Query("from Instrumento p where p.usuario.id =:userid")
	List<Instrumento> obterLista(Integer userid);
}
