package com.rest.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student implements Serializable{

	private static final long serialVersionUID = 1L;
	public Student(){
		
	}

	public Student(Long rollNo,String firstName,String lastName,String fatherName,String motherName,char gender){
		this.rollNo=rollNo;
		this.firstName=firstName;
		this.lastName=lastName;
		this.fatherName=fatherName;
		this.motherName=motherName;
		this.gender=gender;
	}

	private Long rollNo;
	private String firstName;
	private String lastName;
	private String fatherName;
	private String motherName;
	private char gender;
	
	@XmlElement
	public Long getRollNo() {
		return rollNo;
	}
	public void setRollNo(Long rollNo) {
		this.rollNo = rollNo;
	}
	@XmlElement
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@XmlElement
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@XmlElement
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	@XmlElement
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	@XmlElement
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", firstName=" + firstName + ", lastName=" + lastName + ", fatherName="
				+ fatherName + ", motherName=" + motherName + ", gender=" + gender + "]";
	}
}
