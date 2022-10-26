package br.edu.infnet.AppInstrumentos.model.domain;

public class Bateria extends Instrumento{
	
	public boolean isPedalDuplo;
	public boolean isEletronica;
	public int quantidadePratos;
	
	public Bateria(boolean isPedalDuplo, boolean isEletronica, int quantidadePratos) {
		this.isEletronica = isEletronica;
		this.isPedalDuplo = isPedalDuplo;
		this.quantidadePratos = quantidadePratos;
		
	}
	
	@Override
	public String toString() {
		return isPedalDuplo + ";" + isEletronica + ";" + quantidadePratos;
	}
}
