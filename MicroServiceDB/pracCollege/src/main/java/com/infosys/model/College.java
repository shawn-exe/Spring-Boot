package com.infosys.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="College")
public class College {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cid;
	
	@Column(name= "cname")
	private String cname;
	
	@Column(name= "place")
	private String place;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Student student;
	
	
//	 @OneToMany(mappedBy = "college", cascade = CascadeType.ALL)
//	  private List<Student> students;
	 
//	public List<Student> getStudents() {
//		return students;
//	}
//
//	public void setStudents(List<Student> students) {
//		this.students = students;
//	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public College(Long cid, String cname, String place) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.place = place;
	}

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
