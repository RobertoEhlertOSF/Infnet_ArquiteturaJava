package br.edu.infnet.AppInstrumentos.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.AppInstrumentos.model.repository.UsuarioRepository;
import br.edu.infnet.AppInstrumentos.clients.IEnderecoClient;
import br.edu.infnet.AppInstrumentos.model.domain.Endereco;
import br.edu.infnet.AppInstrumentos.model.domain.Usuario;

public class UsuarioService {	
	@Autowired
	UsuarioRepository usuarioRepository;
	@Autowired
	private IEnderecoClient enderecoClient;
		
	public Collection<Usuario> getLista(){
		return (Collection<Usuario>) usuarioRepository.findAll();
	}
	
	public void adicionar(Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	
	public void excluir(int id) {
		usuarioRepository.deleteById(id);
	}
	

	public Usuario validar(String email, String senha) {
		Usuario usuario = usuarioRepository.findByEmail(email);
		
		if(usuario != null && senha.equals(usuario.getSenha())) {
			return usuario;
		}
		
		return null;
	}
	
	public Endereco obterCep(String cep) {
		return enderecoClient.obterCep(cep);
	}

}
