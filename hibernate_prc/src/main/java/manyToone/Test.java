package manyToone;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manyToone.dto.Cart;
import manyToone.dto.Item;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("sachin");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Cart cart =new Cart();
		cart.setId(101);
		cart.setName("Dimple");
		Item item1 = new Item();
		item1.setId(1);
		item1.setName("Real me Gt");
		item1.setManufaturer("Realme");
		item1.setCart(cart);
		
		Item item2 = new Item();
		item2.setId(2);
		item2.setName("Tv");
		item2.setManufaturer("Realme");
		item2.setCart(cart);
		
		Item item3 = new Item();
		item3.setId(3);
		item3.setName("Laptop");
		item3.setManufaturer("HP");
		item3.setCart(cart);
		
		
		et.begin();
		em.persist(cart);

		em.persist(item1);
		em.persist(item2);
		em.persist(item3);
		
		et.commit();
		
	}

}
