package br.edu.infnet.AppInstrumentos.model.domain;

public class Tambor extends Instrumento{

	public String pele;
	public String material;
	public String origem;
	
	public Tambor(String pele, String material, String origem) {
		this.pele = pele;
		this.material = material;
		this.origem = origem;
	}
	
	@Override
	public String toString() {
		return "Tambor -" + pele + ";" + material + ";" + origem;
	}
}
