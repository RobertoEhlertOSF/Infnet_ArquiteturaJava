package br.edu.infnet.AppInstrumentos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.AppInstrumentos.model.domain.Atabaque;
import br.edu.infnet.AppInstrumentos.model.domain.Instrumento;
import br.edu.infnet.AppInstrumentos.model.domain.Bateria;
import br.edu.infnet.AppInstrumentos.model.domain.Violao;

@Controller
public class InstrumentoController {
	
	@GetMapping(value = "/instrumento/lista")
	public String telaLista(Model model) {
		
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
		
		List<Instrumento> instrumentos = new ArrayList();
		instrumentos.add(violao);
		instrumentos.add(bateria);
		instrumentos.add(atabaque);
		
		model.addAttribute("listagem", instrumentos);
		return "instrumento/lista";
	}
}
