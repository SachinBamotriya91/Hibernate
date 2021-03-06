package hibernate_prc_test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate_prc_dto.Student;

public class StudentTest {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sachin");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student student = new Student();
		
		student.setId(2);
		student.setName("Ram");
		student.setAge(22);
		student.setAddress("indore");
		student.setFather_name("kailash");
		student.setMother_name("Devkanya");
		student.setGender("Male");
		et.begin();
		// merge update data if its already there in database  and persist insert data 
		//em.merge(student)
		em.persist(student);
		
		et.commit();
		
	}
}
