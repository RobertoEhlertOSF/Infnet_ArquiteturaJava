package br.edu.infnet.AppInstrumentos.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import br.edu.infnet.AppInstrumentos.model.domain.Atabaque;
import org.springframework.ui.Model;


@Controller
public class AtabaqueController {	
	
	@GetMapping(value = "/atabaque/lista")
	public String telaLista(Model model) {
		
		Atabaque t1 = new Atabaque();
		t1.setOrigem("Ketu");
		t1.setCouroArtificial(false);
		t1.setQuantidadeGanchos(4);
		t1.setValor(399.99);
		t1.setIsImportado(false);
		t1.setFabricante("Jair");
		
		Atabaque t2 = new Atabaque();
		t2.setOrigem("Angola");
		t2.setCouroArtificial(true);
		t2.setQuantidadeGanchos(4);
		t2.setValor(600.00);
		t2.setIsImportado(false);
		t2.setFabricante("Jair");
		
		Atabaque t3 = new Atabaque();
		t3.setOrigem("Bantu");
		t3.setCouroArtificial(false);
		t3.setQuantidadeGanchos(5);
		t3.setValor(999.99);
		t3.setIsImportado(true);
		t3.setFabricante("Gope");
		
		List<Atabaque> atabaques = new ArrayList<Atabaque>();
		atabaques.add(t1);
		atabaques.add(t2);
		atabaques.add(t3);

		model.addAttribute("listagem", atabaques);
		return "atabaque/lista";
	}
	
	public void adicionar(Atabaque atabaque) {
		
	}
}
