package com.rest.service;

import java.util.HashMap;
import java.util.Map;

import com.rest.model.Student;

public class DataUtils {

	public  static Map<Long, Student> getStudentData(){

		Map<Long,Student> studentMap=new HashMap<>();
		Student student1=new Student(1L, "Abhi", "Sharma", "Gopal", "Radha", 'M');
		Student student2=new Student(2L, "Dut", "Gurung", "kesh", "Ujaeli", 'M');
		Student student3=new Student(3L, "Amit", "Singh", "Kuldeep", "Satinder", 'M');
		Student student4=new Student(4L, "Raj", "Singh", "Gurwinder", "Gurbeer", 'M');
		Student student5=new Student(5L, "Krishan", "Verma", "Mohan", "Sita", 'M');
		Student student6=new Student(6L, "Noushi", "Khan", "Mehmood", "Bano", 'M');
		
		studentMap.put(1L,student1);
		studentMap.put(2L,student2);
		studentMap.put(3L,student3);
		studentMap.put(4L,student4);
		studentMap.put(5L,student5);
		studentMap.put(6L,student6);
		return studentMap;
	}

}
