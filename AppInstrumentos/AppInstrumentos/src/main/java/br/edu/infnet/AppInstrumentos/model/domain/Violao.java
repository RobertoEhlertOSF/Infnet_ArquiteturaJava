package br.edu.infnet.AppInstrumentos.model.domain;

public class Violao extends Instrumento {
	
	private boolean isEletrico;
	private int quantidadeCordas;
	private String tipoCorda;
	private int id;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public boolean getIsEletrico() {
		return isEletrico;
	}

	public void setEletrico(boolean isEletrico) {
		this.isEletrico = isEletrico;
	}

	public int getQuantidadeCordas() {
		return quantidadeCordas;
	}

	public void setQuantidadeCordas(int quantidadeCordas) {
		this.quantidadeCordas = quantidadeCordas;
	}

	public String getTipoCorda() {
		return tipoCorda;
	}

	public void setTipoCorda(String tipoCorda) {
		this.tipoCorda = tipoCorda;
	}

	@Override
	public String toString() {
		return "Violão - " + isEletrico + ";" + quantidadeCordas + ";" + tipoCorda;
	}

}
