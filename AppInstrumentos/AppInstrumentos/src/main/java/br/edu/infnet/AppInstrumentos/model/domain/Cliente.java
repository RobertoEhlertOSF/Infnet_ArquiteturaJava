package br.edu.infnet.AppInstrumentos.model.domain;

public class Cliente {
	private String nome;
	private String cpf;
	private String email;
	
	public Cliente(String cpf, String email, String nome) {
		this.cpf = cpf;
		this.email = email;
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return nome + ";" + cpf + ";" + email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
