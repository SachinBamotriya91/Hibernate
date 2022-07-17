package manyToone_uni_dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import manyToone_uni.dto.Company;
import manyToone_uni.dto.Employee;

public class EmployeeDao {
	public EntityManager getEntityManager() {
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("sachin");
		EntityManager em = emf.createEntityManager();
		return em;
	}
	public void saveEmployee(Employee employee) {
		EntityManager em = getEntityManager();
		EntityTransaction et = em.getTransaction();
		Company company = employee.getCompany();
		et.begin();
		em.merge(company);
		em.persist(employee);
		et.commit();
	}
	
	public Employee findEmployeeById(int id) {
		EntityManager em = getEntityManager();
		Employee employee = em.find(Employee.class, id);
		return employee;
	}
	
	public boolean deleteEmployee(int id) {
		EntityManager em = getEntityManager();
		EntityTransaction et = em.getTransaction();
		Employee employee = findEmployeeById(id);
		
		if(employee!=null) {
			et.begin();
			em.remove(employee);
			et.commit();
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public Employee updateEmployee(Employee employee) {
		EntityManager em = getEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Company company = employee.getCompany();
		et.begin();
		em.merge(company);
		em.merge(employee);
		et.commit();
		return employee;
	}
	
	public List<Employee> findAllEmployees() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sachin");
		EntityManager em = emf.createEntityManager();
		// findAll method is not available but we can fetc using creating  JPA query
		
		Query query = em.createQuery("select s from Employee s",Employee.class);
		
		List<Employee> list = query.getResultList();
		return list;
	}
	
}
