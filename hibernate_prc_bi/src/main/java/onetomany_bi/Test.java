package onetomany_bi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("sachin");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		/*
		 * Cart cart =new Cart(); cart.setId(101); cart.setName("Dimple"); Items item1 =
		 * new Items(); item1.setId(101); item1.setName("Real me Gt");
		 * item1.setProducer("Realme"); item1.setCart(cart);
		 * 
		 * Items item2 = new Items(); item2.setId(2); item2.setName("Tv");
		 * item2.setProducer("Realme"); item2.setCart(cart);
		 * 
		 * Items item3 = new Items(); item3.setId(3); item3.setName("Laptop");
		 * item3.setProducer("HP"); item3.setCart(cart);
		 * 
		 * List<Items> list =new ArrayList(); list.add(item1); list.add(item2);
		 * list.add(item3);
		 * 
		 * cart.setItems(list);
		 * 
		 * item1.setCart(cart); item2.setCart(cart); item3.setCart(cart);
		 * 
		 * 
		 * et.begin(); em.persist(cart);
		 * 
		 * em.persist(item1); em.persist(item2); em.persist(item3);
		 * 
		 * et.commit();
		 */
		
		Cart cart = em.find(Cart.class, 101);
		
		et.begin();
		em.remove(cart);
		
		et.commit();
		
	}
}
