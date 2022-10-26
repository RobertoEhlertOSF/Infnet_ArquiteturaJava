package br.edu.infnet.AppInstrumentos;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import br.edu.infnet.AppInstrumentos.model.domain.Flauta;

public class FlautaTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Flauta f1 = new Flauta("Transversal", "Sopranino");
		System.out.println("Flauta - " + f1);
		
		Flauta f2 = new Flauta("Doce", "Soprano");
		System.out.println("Flauta - " + f2);
		
		Flauta f3 = new Flauta("Germanica", "Tenor");
		System.out.println("Flauta - " + f3);
	}

}
