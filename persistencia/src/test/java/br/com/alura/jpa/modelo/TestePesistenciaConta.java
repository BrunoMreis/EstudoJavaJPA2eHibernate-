package br.com.alura.jpa.modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestePesistenciaConta {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
		EntityManager createEntityManager = emf.createEntityManager();
		emf.close();

	}

}
