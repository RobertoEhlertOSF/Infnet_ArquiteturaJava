package br.edu.infnet.AppInstrumentos;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import br.edu.infnet.AppInstrumentos.model.domain.Saxofone;

public class SaxofoneTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Saxofone s1 = new Saxofone("Alto", false, false);
		System.out.println("Bateria - " + s1);

		Saxofone s2 = new Saxofone("Barítono", false, true);
		System.out.println("Bateria - " + s2);

		Saxofone s3 = new Saxofone("Tudel", true, true);
		System.out.println("Bateria - " + s3);
	}

}
