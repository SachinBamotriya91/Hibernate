package manyTomany_bi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Student_BI")
public class Student {
	@Id
	int id;
	String name;
	@ManyToMany
	
	@JoinTable(inverseJoinColumns = {@JoinColumn(name="cid")},joinColumns = {@JoinColumn(name="id")})
	List<Courses> courses;
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
	public List<Courses> getCourses() {
		return courses;
	}
	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}
	
	
}
