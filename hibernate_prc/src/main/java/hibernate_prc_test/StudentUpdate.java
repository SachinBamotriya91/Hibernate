package hibernate_prc_test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate_prc_dto.Student;

public class StudentUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sachin");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student student = em.find(Student.class, 1);
		System.out.println(student);
		
		student.setFather_name("KailashB");
		
		et.begin();
		
		
		//em.merge(student); em.persist(student);
		 
		et.commit();
	}

}
