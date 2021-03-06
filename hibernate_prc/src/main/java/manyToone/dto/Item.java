package manyToone.dto;



import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="shopping__cart_item")
public class Item {
	@Id
	@Column(name="item_id")
	private int id;
	private String name;
	private String manufaturer;
	@ManyToOne
	Cart cart ;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManufaturer() {
		return manufaturer;
	}
	public void setManufaturer(String manufaturer) {
		this.manufaturer = manufaturer;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}

	
	
}