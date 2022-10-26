package br.edu.infnet.AppInstrumentos;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppInstrumentos.model.domain.Bateria;

@Component
public class BateriaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Bateria b1 = new Bateria(false, false, 3);
		System.out.println("Bateria - " + b1);

		Bateria b2 = new Bateria(true, false, 4);
		System.out.println("Bateria - " + b2);

		Bateria b3 = new Bateria(true, true, 6);
		System.out.println("Bateria - " + b3);
	}

}
