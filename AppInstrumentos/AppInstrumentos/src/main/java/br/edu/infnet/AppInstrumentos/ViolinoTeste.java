package br.edu.infnet.AppInstrumentos;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import br.edu.infnet.AppInstrumentos.model.domain.Violino;

public class ViolinoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Violino v1 = new Violino("Barroco", false, false);
		System.out.println("Violino - " + v1);
		
		Violino v2 = new Violino("Classico", true, false);
		System.out.println("Violino - " + v2);
		
		Violino v3 = new Violino("Eletrico", true, true);
		System.out.println("Violino - " + v3);
		
	}

}
