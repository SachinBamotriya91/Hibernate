package oneToone.task.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import onetoOne_task.dto.PanCard;

public class PancardDao {
	public EntityManager getEntityManager() {
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("sachin");
		EntityManager em = emf.createEntityManager();
		return em;
	}
	
	public PanCard findPanCard(int id) {
		EntityManager em = getEntityManager();
		PanCard panCard = em.find(PanCard.class, id);
		return panCard;
	}
	
}
