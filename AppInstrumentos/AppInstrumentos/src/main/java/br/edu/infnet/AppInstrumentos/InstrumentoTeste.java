package br.edu.infnet.AppInstrumentos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppInstrumentos.model.domain.Atabaque;
import br.edu.infnet.AppInstrumentos.model.domain.Bateria;
import br.edu.infnet.AppInstrumentos.model.domain.Violao;
import br.edu.infnet.AppInstrumentos.service.InstrumentoService;

@Order(3)
@Component
public class InstrumentoTeste implements ApplicationRunner{
	
	@Autowired
	private InstrumentoService instrumentoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastro de Instrumentos ##");
			
		Bateria bateria = new Bateria();
		bateria.setQuantidadePratos(2);
		bateria.setEletronica(true);
		bateria.setModelo("EBL-F1rst");
		bateria.setValor(3000.00);
		bateria.setFabricante("Yamaha");
		bateria.setIsImportado(false);
		instrumentoService.adicionar(bateria);

		Atabaque atabaque = new Atabaque();		
		atabaque.setOrigem("Ketu");
		atabaque.setCouroArtificial(false);
		atabaque.setQuantidadeGanchos(4);
		atabaque.setValor(399.99);
		atabaque.setIsImportado(false);
		atabaque.setFabricante("Jair");
		instrumentoService.adicionar(atabaque);

		Violao violao = new Violao();		
		violao.setEletrico(true);
		violao.setQuantidadeCordas(7);
		violao.setTipoCorda("Aço");
		violao.setValor(7700.00);
		violao.setIsImportado(true);
		violao.setFabricante("Rozini");
		instrumentoService.adicionar(violao);		
	}
}
