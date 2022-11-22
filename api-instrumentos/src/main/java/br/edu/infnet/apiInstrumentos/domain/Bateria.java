package br.edu.infnet.apiInstrumentos.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "tBateria")
public class Bateria extends Instrumento {
	
	private String modelo;
	private boolean isEletronica;
	private int quantidadePratos;
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean getIsEletronica() {
		return isEletronica;
	}

	public void setEletronica(boolean isEletronica) {
		this.isEletronica = isEletronica;
	}

	public int getQuantidadePratos() {
		return quantidadePratos;
	}

	public void setQuantidadePratos(int quantidadePratos) {
		this.quantidadePratos = quantidadePratos;
	}	
	
	@Override
	public String toString() {
		return "Bateria - " + modelo + ";" + isEletronica + ";" + quantidadePratos + ";" + super.toString();
	}
}
