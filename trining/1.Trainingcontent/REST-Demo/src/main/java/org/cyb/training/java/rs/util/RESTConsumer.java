package main.java.org.cyb.training.java.rs.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import main.java.org.cyb.training.java.rs.model.Student;

public class RESTConsumer {
	
	public static void main(String args[]){
		RESTConsumer restConsumer = new RESTConsumer();
		restConsumer.consumeRestService();
	}

	public void consumeRestService() {
		try {
			String uri = "http://localhost:8080/REST-Demo/rest/student/v1";
			URL url = new URL(uri);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Accept", "application/xml");

			JAXBContext jc = JAXBContext.newInstance(Student.class);
			InputStream xml = connection.getInputStream();
			Student student = (Student) jc.createUnmarshaller().unmarshal(xml);

			connection.disconnect();
			
			System.out.println("Student Id:"+student.getStudentId());
			System.out.println("Student Name:"+student.getStudentName());
			System.out.println("Student Course:"+student.getStudentCourse());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
