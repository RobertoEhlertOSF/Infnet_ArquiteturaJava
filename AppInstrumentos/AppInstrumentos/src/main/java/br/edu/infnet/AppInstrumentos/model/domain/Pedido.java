package br.edu.infnet.AppInstrumentos.model.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tPedido")
public class Pedido {
	
	private boolean entregaEmCasa;
	private LocalDateTime data;
	private String observacoes;
	private Cliente cliente;
	private List<Instrumento> instrumentos;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
		
	public Pedido() {
		this.data = LocalDateTime.now();
		this.entregaEmCasa = true;
	}
	
	public Pedido(Cliente cliente) {
		this();
		this.cliente = cliente;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public boolean getEntregaEmCasa() {
		return entregaEmCasa;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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
	
	public List<Instrumento> getInstrumentos() {
		return instrumentos;
	}

	public void setInstrumentos(List<Instrumento> instrumentos) {
		this.instrumentos = instrumentos;
	}
	
	@Override
	public String toString() {
		return observacoes + ";" + data + ";" + entregaEmCasa + ";" + cliente + ";" + instrumentos.size();
	}
}
