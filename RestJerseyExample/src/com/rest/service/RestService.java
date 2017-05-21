package com.rest.service;

import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rest.model.Student;
/***
 * 
 * @author Deepak
 *
 */
@Path("/service")
public class RestService {

	DataProvider dataProvider = new DataProvider();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/studentRecord/{rollNo}")
	public Map<Long, Student> getStudentRecord(@PathParam(value = "rollNo") Long rollNo) {
		Predicate<? super Entry<Long, Student>> predicate = s -> s.getValue().getRollNo().equals(rollNo);
		
		 Map<Long, Student> studentRecord= dataProvider.getStudentRecord(rollNo, predicate);
			 return studentRecord;
	}

	@GET
	@Produces("application/json")
	@Path("/studentData")
	@RolesAllowed("ADMIN")
	public Map<Long, Student> getAllStudentRecords() {
		return dataProvider.getStudentdata();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/addRecord")
	public void addStudentRecord(String inputJsonObj){
		ObjectMapper mapper = new ObjectMapper();
		Student student=null;
		try {
			student = mapper.readValue(inputJsonObj, Student.class);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		dataProvider.addStudentRecord(student);
	}
}
