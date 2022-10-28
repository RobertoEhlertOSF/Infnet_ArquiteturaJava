package br.edu.infnet.AppInstrumentos;

import br.edu.infnet.AppInstrumentos.model.domain.Cliente;

public class ClienteTeste {

	public static void main(String args[]) {

		Cliente c1 = new Cliente("11111111111", "elberth@elberth.com", "roberto");		
		System.out.println(c1);

		Cliente c2 = new Cliente("22222222222", "professor@escola.com", "Professorson");
		System.out.println(c2);

		Cliente c3 = new Cliente("3333333333", "diretor@escola.com", "Pelton");
		System.out.println(c3);
	}
}
