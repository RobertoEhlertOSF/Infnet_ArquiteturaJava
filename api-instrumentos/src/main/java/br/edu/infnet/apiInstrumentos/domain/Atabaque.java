package br.edu.infnet.apiInstrumentos.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tAtabaque")
public class Atabaque extends Instrumento {

	private Integer quantidadeGanchos;
	private Boolean isCouroArtificial;
	private String origem;

	public Integer getQuantidadeGanchos() {
		return quantidadeGanchos;
	}
	public void setQuantidadeGanchos(Integer quantidadeGanchos) {
		this.quantidadeGanchos = quantidadeGanchos;
	}

	public boolean getisCouroArtificial() {
		return isCouroArtificial;
	}
	
	public void setCouroArtificial(boolean isCouroArtificial) {
		this.isCouroArtificial = isCouroArtificial;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	@Override
	public String toString() {
		return "Atabaque -" + quantidadeGanchos + ";" + isCouroArtificial + ";" + origem + ";" + super.toString();
	}
}