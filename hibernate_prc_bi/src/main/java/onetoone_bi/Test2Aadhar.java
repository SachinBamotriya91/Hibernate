package onetoone_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test2Aadhar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sachin");
		EntityManager em =emf.createEntityManager();
		
		AadharCard aadhar = em.find(AadharCard.class, 101);
		
		System.out.println(aadhar.getId());
		System.out.println(aadhar.getName())	;
		System.out.println(aadhar.getPerson());
		System.out.println(aadhar.getDob());
		System.out.println("********************************************");
		
		Person p = aadhar.getPerson();
		System.out.println(p.getId());
		System.out.println(p.getName())	;
		System.out.println(p.getAddress());
		System.out.println("********************************************");
	}

}
