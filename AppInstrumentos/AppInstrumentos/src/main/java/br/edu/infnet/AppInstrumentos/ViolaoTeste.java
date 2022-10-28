package br.edu.infnet.AppInstrumentos;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import br.edu.infnet.AppInstrumentos.model.domain.Violao;

public class ViolaoTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Violao v1 = new Violao();
		v1.setEletrico(false);
		v1.setQuantidadeCordas(6);
		v1.setTipoCorda("Nylon");
		v1.setValor(399.99);
		v1.setIsImportado(false);
		v1.setFabricante("Fenix");
		System.out.println(v1);
		
		Violao v2 = new Violao();
		v2.setEletrico(true);
		v2.setQuantidadeCordas(6);
		v2.setTipoCorda("Nylon");
		v2.setValor(700.00);
		v2.setIsImportado(true);
		v2.setFabricante("Giannini");
		System.out.println(v2);
		
		Violao v3 = new Violao();
		v3.setEletrico(true);
		v3.setQuantidadeCordas(7);
		v3.setTipoCorda("Aço");
		v3.setValor(7700.00);
		v3.setIsImportado(true);
		v3.setFabricante("Rozini");
		System.out.println(v3);
		
	}

}
