package br.com.alura.jpa.modelo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class TesteJPQL {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
		EntityManager em = emf.createEntityManager();

		String jpql = "select m from Movimentacao m where m.conta = :pConta order by m.valor desc";

		Conta conta = new Conta();
		conta.setId(2L);
		TypedQuery<Movimentacao> query = em.createQuery(jpql, Movimentacao.class);
		query.setParameter("pConta", conta);

		List<Movimentacao> movimentacaes = query.getResultList();
		for (Movimentacao movimentacao : movimentacaes) {
			System.out.println(movimentacao);
		}
	}
}
