package br.edu.infnet.AppInstrumentos.model.domain;

public class Violino extends Instrumento{
	
	public String tamanho;
	public boolean acompanhaBreu;
	public boolean acompanhaEstojo;
	
	public Violino(String tamanho, boolean acompanhaBreu, boolean acompanhaEstojo) {
		this.tamanho = tamanho;
	}
	
	@Override
	public String toString()  {
		return "Violino - " + tamanho + ";" + acompanhaBreu + ";" + acompanhaEstojo;
	}
}
