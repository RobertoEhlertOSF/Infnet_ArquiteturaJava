package br.edu.AppInstrumentos.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.AppInstrumentos.model.domain.Pedido;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido, Integer>{


	@Query("from Pedido p where p.usuario.id =:userid")
	List<Pedido> obterLista(Integer userid);
}
