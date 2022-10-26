package br.edu.infnet.AppInstrumentos;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import br.edu.infnet.AppInstrumentos.model.domain.Violao;

public class ViolaoTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Violao v1 = new Violao(false, 6, "Nylon");
		System.out.println("Violão - " + v1);
		
		Violao v2 = new Violao(false, 6, "Aço");
		System.out.println("Violão - " + v2);
		
		Violao v3 = new Violao(true, 7, "Aço");
		System.out.println("Violão - " + v3);
		
	}

}
