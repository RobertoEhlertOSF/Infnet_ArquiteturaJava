package br.edu.infnet.AppInstrumentos.model.domain;

public class Violao extends Instrumento {
	
	public boolean isEletrico;
	public int quantidadeCordas;
	public String tipoCorda;
	
	public Violao(boolean isEletrico, int quantidadeCordas, String tipoCorda) {
		this.isEletrico = isEletrico;
		this.quantidadeCordas = quantidadeCordas;
		this.tipoCorda = tipoCorda;
	}
	
	@Override
	public String toString() {
		return "Violão - " + isEletrico + ";" + quantidadeCordas + ";" + tipoCorda;
	}

}
