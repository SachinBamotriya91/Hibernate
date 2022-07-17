package manyTomany_bi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Courses_BI")
public class Courses {
	@Id
	int cid;
	String name;
	@ManyToMany(mappedBy="courses")
	List<Student> students;
	public int getId() {
		return cid;
	}
	public void setId(int id) {
		this.cid = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
}
