package br.edu.infnet.AppInstrumentos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppInstrumentos.model.domain.Cliente;
import br.edu.infnet.AppInstrumentos.model.domain.Usuario;
import br.edu.infnet.AppInstrumentos.service.ClienteService;

@Order(3)
@Component
public class ClienteTeste implements ApplicationRunner {
	
	@Autowired
	private ClienteService clienteService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastro de Clientes ##");
		
		Usuario us = new Usuario();
		us.setId(1);

		Cliente c1 = new Cliente("11111111111", "roberto@aluno.com", "roberto");		
		System.out.println(c1);
		clienteService.adicionar(c1);

		Cliente c2 = new Cliente("22222222222", "professor@escola.com", "Professorson");
		System.out.println(c2);
		clienteService.adicionar(c2);

		Cliente c3 = new Cliente("3333333333", "diretor@escola.com", "Pelton");
		System.out.println(c3);
		clienteService.adicionar(c3);
		
	}
}
