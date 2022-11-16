package br.edu.infnet.AppInstrumentos.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "tInstrumento")
public abstract class Instrumento {

	private Double valor;
	private String fabricante;
	private Boolean isImportado;
	
	@ManyToMany(mappedBy = "instrumentos")
	private List<Pedido> pedidos;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
	public Double getValor() {
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
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return id + ";" + valor + ";" + fabricante + ";" + isImportado;
	}
}
