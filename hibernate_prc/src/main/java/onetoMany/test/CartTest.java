package onetoMany.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoMany.dto.Carts;
import onetoMany.dto.Items;

public class CartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("sachin");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Items item1 = new Items();
		item1.setId(1);
		item1.setName("Real me Gt");
		item1.setManufaturer("Realme");
		
		Items item2 = new Items();
		item2.setId(2);
		item2.setName("Tv");
		item2.setManufaturer("Realme");
		
		Items item3 = new Items();
		item3.setId(3);
		item3.setName("Laptop");
		item3.setManufaturer("HP");
		List<Items> list = new ArrayList<Items>();
		list.add(item1);
		list.add(item2);
		list.add(item3);
		Carts cart = new Carts();
		
		cart.setId(101);
		cart.setName("Dimple");
		cart.setItem(list);
		
		et.begin();
		
		em.persist(item1);
		em.persist(item2);
		em.persist(item3);
		em.persist(cart);
		
		et.commit();
		
	}

}
