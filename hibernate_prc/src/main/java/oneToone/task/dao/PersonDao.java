package oneToone.task.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import onetoOne_task.dto.Persons;
import onetooneuni_dto.AadharCard;
public class PersonDao {
	public EntityManager getEntityManager() {
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("sachin");
		EntityManager em = emf.createEntityManager();
		return em;
	}
	
	public void savePerson(Persons person,AadharCard aadharCard) {
		EntityManager em = getEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(aadharCard);
		em.persist(person);

		et.commit();
	}
	

	public void updatePerson(Persons person,AadharCard aadharCard) {
		EntityManager em = getEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.merge(aadharCard);
		em.merge(person);

		et.commit();
	}
	
	public Persons findPersons(int id) {
		EntityManager em = getEntityManager();
		Persons person = em.find(Persons.class, id);
		
		return person;
	}
	
	public void deletePerson(int id) {
		EntityManager em = getEntityManager();
		EntityTransaction et = em.getTransaction();
		Persons person = findPersons(id);
		
		et.begin();
		em.remove(person);
		et.commit();
	}
	
	public Persons findPersonByName(String name) {
		EntityManager em = getEntityManager();
		Query query = em.createQuery("select p from Persons p where p.name=?1",Persons.class);
		query.setParameter(1, name);
		Persons person = (Persons) query.getSingleResult();
		return person;
	}
	
}