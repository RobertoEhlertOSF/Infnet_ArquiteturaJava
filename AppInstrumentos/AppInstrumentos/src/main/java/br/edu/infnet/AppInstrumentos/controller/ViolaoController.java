package br.edu.infnet.AppInstrumentos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.AppInstrumentos.model.domain.Violao;

@Controller
public class ViolaoController {
	
	@GetMapping(value = "/violao/lista")
	public String telaLista(Model model) {
		
		Violao v1 = new Violao();
		v1.setEletrico(false);
		v1.setQuantidadeCordas(6);
		v1.setTipoCorda("Nylon");
		v1.setValor(399.99);
		v1.setIsImportado(false);
		v1.setFabricante("Fenix");
		
		List<Violao> violoes = new ArrayList();
		violoes.add(v1);
		
		model.addAttribute("listagem", violoes);
		return "violao/lista";
	}
}
