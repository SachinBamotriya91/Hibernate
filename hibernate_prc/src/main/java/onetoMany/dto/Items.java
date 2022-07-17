package onetoMany.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Items {
	@Id
	private int id;
	private String name;
	private String manufaturer;
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
	
}
