package com.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.StudentDao;
import com.model.StudentModel;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDao dao;
	
	final static Logger logger = Logger.getLogger(StudentService.class);
	
	public StudentServiceImpl() {
		logger.warn("student service created");
		//System.out.println("student service created");
	}


	
	@Override
	public boolean createStudent(StudentModel stu) throws Exception {
		//System.out.println("createstudent:service called");
		logger.warn("create student : "+stu);
		return dao.createStudent(stu);
	}

	
	@Override
	public List<StudentModel> listStudents() throws Exception {
		//System.out.println("liststudent:service called");
		logger.warn("list students");
		return dao.listStudents();
	}



	@Override
	public StudentModel getStudent(Integer id) throws Exception {
		//System.out.println("getstudent:service called");
		logger.warn("get student id :"+id);
		return dao.getStudent(id);
	}



	@Override
	public boolean deleteStudent(Integer id) throws Exception {
		//System.out.println("deletestudent:service called");
		logger.warn("delete student id :"+id);
		return dao.deleteStudent(id);
	}



	@Override
	public boolean updateStudent(StudentModel student) throws Exception {
		//System.out.println("updatestudent:service called");
		logger.warn("update student :"+student);
		return dao.updateStudent(student);
	}

	
	
}
