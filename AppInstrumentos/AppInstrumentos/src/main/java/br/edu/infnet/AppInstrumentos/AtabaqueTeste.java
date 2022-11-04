package br.edu.infnet.AppInstrumentos;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppInstrumentos.controller.AtabaqueController;
import br.edu.infnet.AppInstrumentos.model.domain.Atabaque;

@Order(4)
@Component
public class AtabaqueTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastro de Atabaques ##");

		Atabaque t1 = new Atabaque();
		t1.setOrigem("Ketu");
		t1.setCouroArtificial(false);
		t1.setQuantidadeGanchos(4);
		t1.setValor(399.99);
		t1.setIsImportado(false);
		t1.setFabricante("Jair");
		System.out.println(t1);
		AtabaqueController.adicionar(t1);
		
		Atabaque t2 = new Atabaque();
		t2.setOrigem("Angola");
		t2.setCouroArtificial(true);
		t2.setQuantidadeGanchos(4);
		t2.setValor(600.00);
		t2.setIsImportado(false);
		t2.setFabricante("Jair");
		System.out.println(t2);
		AtabaqueController.adicionar(t2);
		
		Atabaque t3 = new Atabaque();
		t3.setOrigem("Bantu");
		t3.setCouroArtificial(false);
		t3.setQuantidadeGanchos(5);
		t3.setValor(999.99);
		t3.setIsImportado(true);
		t3.setFabricante("Gope");
		System.out.println(t3);
		AtabaqueController.adicionar(t3);		
	}
}
