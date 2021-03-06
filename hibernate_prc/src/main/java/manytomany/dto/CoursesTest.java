package manytomany.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CoursesTest {
	public static void main(String[] args) {
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("sachin");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Courses courses =new Courses();
		courses.setId(100);
		courses.setCname("Java");
		
		Courses courses1 =new Courses();
		courses1.setId(101);
		courses1.setCname("web Technology");
		
		Courses courses2 =new Courses();
		courses2.setId(103);
		courses2.setCname("Advance Java");
		
		List<Courses> list = new ArrayList();
		list.add(courses);
		list.add(courses1);
		Students student =new Students();
		
		student.setId(1);
		student.setName("Sachin");
		student.setCourses(list);
		
		Students student1 =new Students();
		
		student1.setId(2);
		student1.setName("Rakesh");
		
		List<Courses> list1 = new ArrayList();
		list.add(courses);
		list.add(courses1);
		list.add(courses2);
		student1.setCourses(list1);
		
		et.begin();
		em.persist(courses);
		em.persist(courses1);
		em.persist(courses2);
		em.persist(student);
		em.persist(student1);
		
		et.commit();
		
		
		
		
		
	}
}
