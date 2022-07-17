package onetoone_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test1FindPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sachin");
		EntityManager em =emf.createEntityManager();
		
		Person p = em.find(Person.class, 101);
		System.out.println(p.getId());
		System.out.println(p.getName())	;
		System.out.println(p.getAddress());
		System.out.println("********************************************");
		
		AadharCard aadhar = p.getAadhar();
		
		System.out.println(aadhar.getId());
		System.out.println(aadhar.getName())	;
		System.out.println(aadhar.getDob());
		System.out.println("********************************************");
	}

}
