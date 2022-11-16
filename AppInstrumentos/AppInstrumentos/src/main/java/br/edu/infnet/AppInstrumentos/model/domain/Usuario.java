package br.edu.infnet.AppInstrumentos.model.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tUsuario")
public class Usuario {
	private String nome;
	private String senha;
	private String email;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToMany
	@JoinColumn(name = "idUsuario")
	private List<Cliente> clientes;
	
	@OneToMany
	@JoinColumn(name = "idUsuario")
	private List<Pedido> pedidos;
	
	@OneToMany
	@JoinColumn(name = "idUsuario")
	private List<Instrumento> instrumentos;
	
	@OneToOne (cascade = CascadeType.PERSIST)
	@JoinColumn(name = "idendereco")
	private Endereco endereco;
	
	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Usuario() {}
	
	public Usuario(String senha, String email, String nome) {
		this.senha = senha;
		this.email = email;
		this.nome = nome;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return nome + ";" + senha + ";" + email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
