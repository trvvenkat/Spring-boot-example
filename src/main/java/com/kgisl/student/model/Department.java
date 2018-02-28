package com.kgisl.student.model;

import java.util.List;
import javax.persistence.*;

@Entity
public class Department  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long DepartmentId;


	@Column
	private String name;

	@Column
	private String institute;


	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
	@JoinColumn(name = "DepartmentId")
	private List<Student> Student;
	//private Student ag;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Long getId() {
		return DepartmentId;
	}

	public void setId(Long DepartmentId) {
		this.DepartmentId = DepartmentId;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInstitute() {
		return institute;
	}

	public void setInstitute(String institute) {
		this.institute = institute;
	}


	public List<Student> getStudent() {
		return Student;
	}

	public void setStudent(List<Student> Student) {
		this.Student = Student;
	}

}