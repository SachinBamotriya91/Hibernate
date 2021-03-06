package onetoone_bi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	int id;
	String name;
	String address;
	@OneToOne(mappedBy="person")
	AadharCard aadhar;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public AadharCard getAadhar() {
		return aadhar;
	}

	public void setAadhar(AadharCard aadhar) {
		this.aadhar = aadhar;
	}
	
}
