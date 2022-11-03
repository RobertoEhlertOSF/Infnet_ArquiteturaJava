package br.edu.infnet.AppInstrumentos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.AppInstrumentos.model.domain.Bateria;

@Controller
public class BateriaController {
	
	@GetMapping(value = "/bateria/lista")
	public String telaLista(Model model) {
		
		Bateria b1 = new Bateria();
		b1.setEletronica(false);
		b1.setModelo("DTX400");
		b1.setQuantidadePratos(3);
		b1.setValor(3499.99);
		b1.setIsImportado(true);
		b1.setFabricante("Shelter");
		
		Bateria b2 = new Bateria();
		b2.setEletronica(true);
		b2.setModelo("PD-85B");
		b2.setQuantidadePratos(4);
		b2.setIsImportado(false);
		b2.setFabricante("Yahama");
		b2.setValor(6499.99);

		Bateria b3 = new Bateria();
		b3.setEletronica(true);
		b3.setModelo("EBL-F1rst");
		b3.setQuantidadePratos(6);
		b3.setIsImportado(true);
		b3.setFabricante("Action");
		b3.setValor(7000.00);
		
		List<Bateria> baterias = new ArrayList();
		baterias.add(b1);
		baterias.add(b2);
		baterias.add(b3);
		
		model.addAttribute("listagem", baterias);
		
		return "bateria/lista";
	}
}
