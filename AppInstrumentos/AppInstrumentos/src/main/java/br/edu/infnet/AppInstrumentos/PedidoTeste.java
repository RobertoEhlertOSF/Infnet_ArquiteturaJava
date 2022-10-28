package br.edu.infnet.AppInstrumentos;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import br.edu.infnet.AppInstrumentos.model.domain.Pedido;

public class PedidoTeste implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#pedido");

		Pedido p1 = new Pedido();
		p1.setObservacoes("Pedido 1");
		p1.setData(LocalDateTime.now());
		p1.setEntregaEmCasa(false);
		System.out.println(p1);

		Pedido p2 = new Pedido();
		p2.setObservacoes("Pedido 2");
		p2.setData(LocalDateTime.now());
		p2.setEntregaEmCasa(false);
		System.out.println(p1);

		Pedido p3 = new Pedido();
		p3.setObservacoes("Pedido 3");
		p3.setData(LocalDateTime.now());
		p3.setEntregaEmCasa(true);
		System.out.println(p1);

	}

}
