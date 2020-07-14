package br.com.alura.jpa.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Cliente {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String Endereco;
	
    
    @OneToOne
    @JoinColumn(unique = true)
	private Conta conta;
	
	@Deprecated
	public Cliente() {
	}


	public Cliente(String nome, String endereco) {
		
		this.nome = nome;
		Endereco = endereco;
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return Endereco;
	}


	public void setEndereco(String endereco) {
		Endereco = endereco;
	}


	public Conta getConta() {
		return conta;
	}


	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	
	
	

}
