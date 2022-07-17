package manyToone_uni_dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import manyToone_uni.dto.Company;

public class CompanyDao {
	public EntityManager getEntityManager() {
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("sachin");
		EntityManager em = emf.createEntityManager();
		return em;
	}
	public void saveCompany(Company company) {
		EntityManager em = getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(company);
		et.commit();
	}
	
	public Company findCompanyById(int id) {
		EntityManager em = getEntityManager();
		Company company = em.find(Company.class, id);
		return company;
	}
	

	public boolean deleteCompany(int id) {
		EntityManager em = getEntityManager();
		EntityTransaction et = em.getTransaction();
		Company company = findCompanyById(id);
		
		if(company!=null) {
			et.begin();
			em.remove(company);
			et.commit();
			return true;
		}
		else {
			return false;
		}
		 
	}
	
	public Company updateCompany(Company company) {
		EntityManager em = getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.merge(company);
		et.commit();
		return company;
	}
	
	public List<Company> findAllCompanyies() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sachin");
		EntityManager em = emf.createEntityManager();
		// findAll method is not available but we can fetc using creating  JPA query
		
		Query query = em.createQuery("select s from Company s",Company.class);
		
		List<Company> list = query.getResultList();
		
		return list;
	}
}
