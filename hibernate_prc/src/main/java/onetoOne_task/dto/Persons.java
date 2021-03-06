package onetoOne_task.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Persons {
	@Id
	private int pid;
	private String name;
	private String city;
	
	@OneToOne
	private PanCard pan;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public PanCard getPan() {
		return pan;
	}
	public void setPan(PanCard pan) {
		this.pan = pan;
	}
	
	
	
}
