package br.com.alura.jpa.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categoria {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		public long id;
		public String nome;
		
		@Deprecated
		public Categoria() {
		}


		public Categoria(String nome) {
			this.nome = nome;
		}


		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public void setId(long id) {
			this.id = id;
		}
		
		public Long getId() {
			return this.id;
		}


		@Override
		public String toString() {
			return "Categoria [id=" + id + ", nome=" + nome + "]";
		}
		
		
}
