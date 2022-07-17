package onetoone_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person =new Person();
		person.setId(101);
		person.setName("Ram");
		person.setAddress("Indore");
		
		AadharCard aadhar = new AadharCard();
		aadhar.setId(101);
		aadhar.setName("Ram");
		aadhar.setDob("10/03/1999");
		aadhar.setPerson(person);
		
		person.setAadhar(aadhar);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sachin");
		EntityManager em =emf.createEntityManager();
		
		//when we want to insert and update data then use transaction
		EntityTransaction et = em.getTransaction();
		
		
		et.begin();
		
		em.persist(person);
		em.persist(aadhar);
		
		et.commit();
		
	}

}
