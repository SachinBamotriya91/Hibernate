package onetooneuni_test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetooneuni_dto.AadharCard;
import onetooneuni_dto.Person;

public class PersonAadharTest {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sachin");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person person = new Person();
		person.setPid(4);
		person.setName("Nilesh");
		person.setCity("Indore");
		
		AadharCard aadharCard = new AadharCard();
		aadharCard.setAid(123);
		aadharCard.setAddress("Depalpur Indore");
		aadharCard.setDob("10/03/1999");
		
		person.setAadhar(aadharCard);
		
		et.begin();
		
		em.persist(person);
		em.persist(aadharCard);
		
		et.commit();
		
		
		
		
	}
}
