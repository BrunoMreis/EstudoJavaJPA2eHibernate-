package br.com.alura.jpa.modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteContaPopula {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
     //   conta.setTitular("Paula");
        conta.setConta(29);
        conta.setAgencia(1991);
        
        

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

//        Transient -> Managed
        em.persist(conta);
        
        //busca
//       Conta conta2 = em.find(Conta.class, 1L);
       
       
       em.getTransaction().commit();
       em.close();
     //////////////////////////////////////////////////////////////////  
       EntityManager em2 = emf.createEntityManager();
       
       
       
       em2.merge(conta);

        //Managed -> Removed
        em.remove(conta);
        em2.getTransaction().commit();
        em2.close();

       
       
		
		
		

	}

}
