package br.edu.AppInstrumentos.model.repository;

import org.springframework.data.repository.CrudRepository;
import br.edu.infnet.AppInstrumentos.model.domain.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{
	
	Usuario findByEmail(String email);
}
