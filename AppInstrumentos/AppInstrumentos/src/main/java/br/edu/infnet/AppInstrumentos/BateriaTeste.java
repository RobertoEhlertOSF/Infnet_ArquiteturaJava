package br.edu.infnet.AppInstrumentos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppInstrumentos.model.domain.Bateria;
import br.edu.infnet.AppInstrumentos.service.BateriaService;

@Order(5)
@Component
public class BateriaTeste implements ApplicationRunner {
	
	@Autowired
	private BateriaService bateriaService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastro de Baterias ##");

		Bateria b1 = new Bateria();
		b1.setEletronica(false);
		b1.setModelo("DTX400");
		b1.setQuantidadePratos(3);
		b1.setValor(3499.99);
		b1.setIsImportado(true);
		b1.setFabricante("Shelter");
		System.out.println(b1);
		bateriaService.adicionar(b1);
		
		Bateria b2 = new Bateria();
		b2.setEletronica(true);
		b2.setModelo("PD-85B");
		b2.setQuantidadePratos(4);
		b2.setIsImportado(false);
		b2.setFabricante("Yahama");
		b2.setValor(6499.99);
		System.out.println(b2);
		bateriaService.adicionar(b2);

		Bateria b3 = new Bateria();
		b3.setEletronica(true);
		b3.setModelo("EBL-F1rst");
		b3.setQuantidadePratos(6);
		b3.setIsImportado(true);
		b3.setFabricante("Action");
		b3.setValor(7000.00);
		System.out.println(b3);
		bateriaService.adicionar(b3);
	}
}
