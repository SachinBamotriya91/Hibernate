package manyToone_uni.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Company")
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="cid")
	int cid;
	String cname;
	String address;
	String ceo;
	long revanue;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public long getRevanue() {
		return revanue;
	}
	public void setRevanue(long revanue) {
		this.revanue = revanue;
	}
	@Override
	public String toString() {
		return "Company [cid=" + cid + ", cname=" + cname + ", address=" + address + ", ceo=" + ceo + ", revanue="
				+ revanue + "]";
	}
	
	
}
