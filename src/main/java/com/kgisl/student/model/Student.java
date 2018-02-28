package com.kgisl.student.model;

import javax.persistence.*;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long StudentId;

	@Column
	private String Name;

	@Column
	private String dept;


	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "DepartmentId", updatable = false, insertable = true)
	private Department Department;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Long getaId() {
		return StudentId;
	}

	public void setaId(Long StudentId) {
		this.StudentId = StudentId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}



	public void setDepartment(Department Department) {
		this.Department = Department;}
	}