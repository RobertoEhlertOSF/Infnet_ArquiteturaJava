package br.edu.infnet.AppInstrumentos.model.domain;

public class Saxofone extends Instrumento {
	public String familia;
	public boolean acompanhaEscova;
	public boolean acompanhaEstojo;
	
	public Saxofone(String familia, boolean acompanhaEscova, boolean acompanhaEstojo) {
		this.familia = familia;
		this.acompanhaEscova = acompanhaEscova;
		this.acompanhaEstojo = acompanhaEstojo;
	}
	
	@Override
	public String toString() {
		return "Saxofone - " + familia + ";" + acompanhaEscova + ";" + acompanhaEstojo;
	}
}
