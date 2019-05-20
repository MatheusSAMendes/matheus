package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Advogado;

public class Programa {

	public static void main(String[] args) {
		Advogado advogado = new Advogado(null, "Matheus Araujo", 14158);
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("matheus");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
//		Advogado advogadoFound = entityManager.find(Advogado.class, 1);
//		System.out.println(advogadoFound);
		
		entityManager.getTransaction().begin();
		entityManager.persist(advogado);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}
}
