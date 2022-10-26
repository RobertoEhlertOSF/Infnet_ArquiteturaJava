package br.edu.infnet.AppInstrumentos;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import br.edu.infnet.AppInstrumentos.model.domain.Tambor;

public class TamborTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Tambor t1 = new Tambor("Sintetico", "madeira", "nacional");
		System.out.println("Tambor - " + t1);
		
		Tambor t2 = new Tambor("Couro Cabra","Aluminio" ,"africano");
		System.out.println("Tambor - " + t2);
		
		Tambor t3 = new Tambor("Sintetico", "Madeira", "Americano");
		System.out.println("Tambor - " + t3);
		
	}

}
