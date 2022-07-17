package oneTooneuni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import onetooneuni_dto.AadharCard;

public class AadharDao {
	public EntityManager getEntityManager() {
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("sachin");
		EntityManager em = emf.createEntityManager();
		return em;
	}
	
	public AadharCard findAadharCard(int id) {
		EntityManager em = getEntityManager();
		AadharCard aadharCard = em.find(AadharCard.class, id);
		return aadharCard;
	}
	
}
