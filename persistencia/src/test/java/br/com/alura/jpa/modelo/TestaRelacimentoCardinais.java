package br.com.alura.jpa.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestaRelacimentoCardinais {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Maiven", "Rua das Belas");
		
		Categoria categoria1 = new Categoria("Negócio");
		Categoria categoria2 = new Categoria("Negócio");
		
		Conta conta = new Conta(123, 5676, cliente);
		
		
		conta.setSaldo(new BigDecimal(3500.00));
		cliente.setConta(conta);
		
		Movimentacao movimentacao1 = new Movimentacao();
		movimentacao1.setConta(conta);
		movimentacao1.setData(LocalDate.now());
		movimentacao1.setValor(new BigDecimal(500.0));
		movimentacao1.setDescricao("Passagem SP");
		movimentacao1.setTipo(TipoDeMovimentacao.SAIDA);
		movimentacao1.setCategorias(Arrays.asList(categoria1, categoria2));
		
		Movimentacao movimentacao2 = new Movimentacao();
		movimentacao2.setConta(conta);
		movimentacao2.setData(LocalDate.now());
		movimentacao2.setValor(new BigDecimal(500.0));
		movimentacao2.setDescricao("Passagem AM");
		movimentacao2.setTipo(TipoDeMovimentacao.SAIDA);
		movimentacao2.setCategorias(Arrays.asList(categoria1, categoria2));
		
		conta.setMovimentacoes(Arrays.asList(movimentacao1, movimentacao2));
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(cliente);
        em.persist(categoria1);
        em.persist(categoria2);
        em.persist(conta);
        em.persist(movimentacao1);
        em.persist(movimentacao2);
        em.getTransaction().commit();
        
        em.close();
		
	}

}
