package com.rest.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Predicate;

import com.rest.exception.RecordNotFoundException;
import com.rest.model.Student;

public class DataProvider {

	public static Map<Long, Student> getStudentdata(){
		return DataUtils.getStudentData();
	}
	
	public Map<Long, Student> getStudentRecord(Long rollNo, Predicate<? super Entry<Long, Student>> predicate) {
		Map<Long, Student> studentMap=getStudentdata();

		Map<Long, Student> studentRecord=new HashMap<>();
		Student student=filterStudentRecord(studentMap,predicate);
		
		studentRecord.put(rollNo, student);
		return studentRecord;
	}
	
	private Student filterStudentRecord(Map<Long, Student> studentMap,Predicate<? super Entry<Long, Student>> predicate){
		
		Optional<Entry<Long, Student>> studentRecordMap=studentMap.entrySet().stream().filter(predicate).findFirst();
		
		if(studentRecordMap.isPresent()){
			return studentRecordMap.get().getValue();
		}else{
			throw new RecordNotFoundException("Record not found");
		}

	}

	public void addStudentRecord(Student student) {

		Map<Long, Student> studentMap=getStudentdata();
		studentMap.put(student.getRollNo(),student);
		studentMap.entrySet().forEach(s->System.out.println(s));
	}
	
}
