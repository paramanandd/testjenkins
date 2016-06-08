package main.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import main.java.org.cyb.training.java.rs.model.Student;


@Path("/student/v1")
public class StudentResource {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Student getStudent(){
		Student student = new Student();
		student.setStudentId(1);
		student.setStudentName("Deepak");
		student.setStudentCourse("Java");
		return student;
	}
	
}
