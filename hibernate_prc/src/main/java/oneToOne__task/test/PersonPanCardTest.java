package oneToOne__task.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoOne_task.dto.PanCard;
import onetoOne_task.dto.Persons;

public class PersonPanCardTest {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sachin");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Persons person = new Persons();
		person.setPid(4);
		person.setName("Nilesh");
		person.setCity("Indore");
		
		PanCard panCard = new PanCard();
		panCard.setPid(123);
		panCard.setAddress("Depalpur Indore");
		panCard.setDob("10/03/1999");
		
		person.setPan(panCard);
		
		et.begin();
		
		em.persist(person);
		em.persist(panCard);
		
		et.commit();
	}
}
