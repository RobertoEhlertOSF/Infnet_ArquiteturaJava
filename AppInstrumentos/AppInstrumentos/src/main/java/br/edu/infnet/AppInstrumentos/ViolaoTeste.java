package br.edu.infnet.AppInstrumentos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppInstrumentos.model.domain.Violao;
import br.edu.infnet.AppInstrumentos.service.ViolaoService;

@Order(7)
@Component
public class ViolaoTeste implements ApplicationRunner{
	
	@Autowired
	private ViolaoService violaoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastro de Violões ##");

		Violao v1 = new Violao();
		v1.setEletrico(false);
		v1.setQuantidadeCordas(6);
		v1.setTipoCorda("Nylon");
		v1.setValor(399.99);
		v1.setIsImportado(false);
		v1.setFabricante("Fenix");
		System.out.println(v1);
		violaoService.adicionar(v1);
		
		Violao v2 = new Violao();
		v2.setEletrico(true);
		v2.setQuantidadeCordas(6);
		v2.setTipoCorda("Nylon");
		v2.setValor(700.00);
		v2.setIsImportado(true);
		v2.setFabricante("Giannini");
		System.out.println(v2);
		violaoService.adicionar(v2);
		
		Violao v3 = new Violao();
		v3.setEletrico(true);
		v3.setQuantidadeCordas(7);
		v3.setTipoCorda("Aço");
		v3.setValor(7700.00);
		v3.setIsImportado(true);
		v3.setFabricante("Rozini");
		System.out.println(v3);	
		violaoService.adicionar(v3);
	}
}
