package br.edu.infnet.AppInstrumentos.model.domain;

public class Instrumento {

	private Double valor;
	private String fabricante;
	private Boolean isImportado;
	
	private Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public Boolean getIsImportado() {
		return isImportado;
	}
	public void setIsImportado(Boolean isImportado) {
		this.isImportado = isImportado;
	}
	
	
}
