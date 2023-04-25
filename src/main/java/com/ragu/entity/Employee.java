package com.ragu.entity;



import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table
public class Employee  implements Serializable{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Column(name = "EMP_ID",nullable = false, length = 512, unique = true)
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int empid;


public int getEmpid() {
	return empid;
}





public void setEmpid(int empid) {
	this.empid = empid;
}


@Column(name = "NAME", nullable = false)
@NotBlank(message = "Name is Mandatory")
@Pattern(regexp =("[A-Za-z]*"),message = " must be a alphabet")
private String name;

@Column(name = "AGE", nullable = false)
private int age;

@Column(name = "SKILL_SET")
@Size(min = 2, message = "Skill_set should have atleast 2 characters")
@Pattern(regexp =("[A-Za-z]*"),message = "Skill_set must be a alphabet")
private String skillset;


@Column(name = "LOCATION", nullable = false)
@Size(min = 2, message = "Location should have atleast 2 characters")
@Pattern(regexp =("[A-Za-z]*"),message = "Location must be a alphabet")
private String location;


public Employee() {
	
}





public Employee(int empid,String name,int age,String skillset,String location) {
	super();
	this.empid = empid;
	this.name = name;
	this.age = age;
	this.skillset = skillset;
	this.location = location;
}







public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}





public String getSkillset() {
	return skillset;
}


public void setSkillset(String skillset) {
	this.skillset = skillset;
}


public String getLocation() {
	return location;
}


public void setLocation(String location) {
	this.location = location;
}



}
