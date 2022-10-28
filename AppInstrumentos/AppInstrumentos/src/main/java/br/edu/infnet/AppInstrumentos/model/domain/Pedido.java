package br.edu.infnet.AppInstrumentos.model.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
	
	private boolean entregaEmCasa;
	private LocalDateTime data;
	private String observacoes;
	
	public boolean getEntregaEmCasa() {
		return entregaEmCasa;
	}
	public void setEntregaEmCasa(Boolean entregaEmCasa) {
		this.entregaEmCasa = entregaEmCasa;
	}
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
	@Override
	public String toString() {
		return observacoes + ";" + data + ";" + entregaEmCasa;
	}
}
