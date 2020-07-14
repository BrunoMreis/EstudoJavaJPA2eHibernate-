package br.com.alura.jpa.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestaRelacionamento {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		//conta.setCliente("Paula"); 
		conta.setAgencia(29);
		conta.setConta(1991);
		conta.setSaldo(new BigDecimal(5550.0));
		
		Movimentacao movimentacao = new Movimentacao();
		
		
		movimentacao.setConta(conta);
		movimentacao.setData(LocalDate.now());
		movimentacao.setDescricao("Restaurante");
		movimentacao.setTipo(TipoDeMovimentacao.SAIDA);
		movimentacao.setValor(new BigDecimal(170.47));
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        
        em.persist(conta);
        em.persist(movimentacao);

        em.getTransaction().commit();
        
        em.close();
        
		
		
		
	}
	
	

}
