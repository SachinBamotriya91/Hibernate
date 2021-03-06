package oneTooneuni.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import onetooneuni_dto.AadharCard;
import onetooneuni_dto.Person;

public class PersonDao {
	public EntityManager getEntityManager() {
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("sachin");
		EntityManager em = emf.createEntityManager();
		return em;
	}
	
	public void savePerson(Person person,AadharCard aadharCard) {
		EntityManager em = getEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(aadharCard);
		em.persist(person);

		et.commit();
	}
	

	public void updatePerson(Person person,AadharCard aadharCard) {
		EntityManager em = getEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.merge(aadharCard);
		em.merge(person);

		et.commit();
	}
	
	public Person findPerson(int id) {
		EntityManager em = getEntityManager();
		Person person = em.find(Person.class, id);
		
		return person;
	}
	
	public void deletePerson(int id) {
		EntityManager em = getEntityManager();
		EntityTransaction et = em.getTransaction();
		Person person = findPerson(id);
		
		et.begin();
		em.remove(person);
		et.commit();
	}
	
	public Person findPersonByName(String name) {
		EntityManager em = getEntityManager();
		Query query = em.createQuery("select p from Person p where p.name=?1",Person.class);
		query.setParameter(1, name);
		Person person = (Person) query.getSingleResult();
		return person;
	}
	
}