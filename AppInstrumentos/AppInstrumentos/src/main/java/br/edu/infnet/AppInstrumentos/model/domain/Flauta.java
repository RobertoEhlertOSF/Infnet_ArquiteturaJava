package br.edu.infnet.AppInstrumentos.model.domain;

public class Flauta extends Instrumento{
	public String tipo;
	public String formato;
	public String estilo;
	
	public Flauta(String tipo, String estilo) {
		this.tipo = tipo;
		this.estilo = estilo;
	}
	
	@Override
	public String toString() {
		return "Flauta - " + tipo + ";" + estilo;
	}
}
