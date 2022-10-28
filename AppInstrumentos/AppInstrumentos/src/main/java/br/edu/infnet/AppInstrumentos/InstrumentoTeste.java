package br.edu.infnet.AppInstrumentos;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import br.edu.infnet.AppInstrumentos.model.domain.Atabaque;
import br.edu.infnet.AppInstrumentos.model.domain.Bateria;
import br.edu.infnet.AppInstrumentos.model.domain.Violao;

public class InstrumentoTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Pedidos ##");
		
		Bateria bateria = new Bateria();
		bateria.setQuantidadePratos(2);
		bateria.setEletronica(true);
		bateria.setModelo("EBL-F1rst");
		bateria.setValor(3000.00);
		bateria.setFabricante("Yamaha");
		bateria.setIsImportado(false);

		Atabaque atabaque = new Atabaque();		
		atabaque.setOrigem("Ketu");
		atabaque.setCouroArtificial(false);
		atabaque.setQuantidadeGanchos(4);
		atabaque.setValor(399.99);
		atabaque.setIsImportado(false);
		atabaque.setFabricante("Jair");

		Violao violao = new Violao();		
		violao.setEletrico(true);
		violao.setQuantidadeCordas(7);
		violao.setTipoCorda("Aço");
		violao.setValor(7700.00);
		violao.setIsImportado(true);
		violao.setFabricante("Rozini");
		
	}


}
