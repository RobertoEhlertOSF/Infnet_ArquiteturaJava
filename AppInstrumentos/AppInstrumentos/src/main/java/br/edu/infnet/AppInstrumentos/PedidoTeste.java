package br.edu.infnet.AppInstrumentos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppInstrumentos.model.domain.Atabaque;
import br.edu.infnet.AppInstrumentos.model.domain.Bateria;
import br.edu.infnet.AppInstrumentos.model.domain.Cliente;
import br.edu.infnet.AppInstrumentos.model.domain.Pedido;
import br.edu.infnet.AppInstrumentos.model.domain.Violao;
import br.edu.infnet.AppInstrumentos.service.PedidoService;
import br.edu.infnet.AppInstrumentos.model.domain.Instrumento;

@Order(1)
@Component
public class PedidoTeste implements ApplicationRunner {
	
	@Autowired
	private PedidoService pedidoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastro de Pedidos ##");

		Pedido p1 = new Pedido();
		Cliente c1 = new Cliente("11111111111", "roberto@aluno.com", "roberto");
		List<Instrumento> instrumentos1 = listaInstrumentosMock(2);		
		p1.setObservacoes("Pedido 1");
		p1.setData(LocalDateTime.now());
		p1.setEntregaEmCasa(false);
		p1.setCliente(c1);
		p1.setInstrumentos(instrumentos1);
		System.out.println(p1);
		pedidoService.adicionar(p1);

		Cliente c2 = new Cliente("22222222222", "professor@escola.com", "Professorson");
		Pedido p2 = new Pedido(c2);
		List<Instrumento> instrumentos2 = listaInstrumentosMock(1);
		p2.setObservacoes("Pedido 2");
		p2.setData(LocalDateTime.now());
		p2.setCliente(c2);
		p2.setEntregaEmCasa(false);
		p2.setInstrumentos(instrumentos2);		
		System.out.println(p2);
		pedidoService.adicionar(p2);

		Cliente c3 = new Cliente("3333333333", "diretor@escola.com", "Pelton");
		List<Instrumento> instrumentos3 = listaInstrumentosMock(3);
		Pedido p3 = new Pedido();
		p3.setObservacoes("Pedido 3");
		p3.setCliente(c3);
		p3.setEntregaEmCasa(false);
		p3.setData(LocalDateTime.now());
		p3.setEntregaEmCasa(true);
		p3.setInstrumentos(instrumentos3);
		System.out.println(p3);
		pedidoService.adicionar(p3);
	}
	
	private List<Instrumento> listaInstrumentosMock(int quantidadeInstrumentos){
		
		List<Instrumento> instrumentos = new ArrayList<Instrumento>();
		
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
		
		switch(quantidadeInstrumentos) {
		case 1: 
			instrumentos.add(bateria);
		case 2: 
			instrumentos.add(atabaque);
			instrumentos.add(bateria);
		case 3:
			instrumentos.add(atabaque);
			instrumentos.add(bateria);
			instrumentos.add(violao);
		}		
		return instrumentos;
	}
	

}
