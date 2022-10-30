package br.edu.infnet.AppInstrumentos;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppInstrumentos.model.domain.Cliente;

@Order(2)
@Component
public class ClienteTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastro de Clientes ##");

		Cliente c1 = new Cliente("11111111111", "roberto@aluno.com", "roberto");		
		System.out.println(c1);

		Cliente c2 = new Cliente("22222222222", "professor@escola.com", "Professorson");
		System.out.println(c2);

		Cliente c3 = new Cliente("3333333333", "diretor@escola.com", "Pelton");
		System.out.println(c3);
		
	}
}
