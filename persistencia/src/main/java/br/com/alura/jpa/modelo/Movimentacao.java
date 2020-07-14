package br.com.alura.jpa.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Movimentacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private TipoDeMovimentacao tipo;
	private LocalDate data;
	private BigDecimal valor;
	private String descricao;

	@ManyToOne
	private Conta conta;

	@ManyToMany
	private List<Categoria> categorias;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoDeMovimentacao getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeMovimentacao tipo) {
		this.tipo = tipo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	@Override
	public String toString() {
		return "Movimentacao [id=" + id + ", tipo=" + tipo + ", data=" + data + ", valor=" + valor + ", descricao="
				+ descricao + ", categorias=" + categorias + "]";
	}

}
