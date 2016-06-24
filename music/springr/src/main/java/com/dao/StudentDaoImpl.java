package com.dao;


import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.model.StudentModel;

@Repository
public class StudentDaoImpl implements StudentDao
{
	@Autowired
	private SessionFactory factory;
	
	final static Logger logger = Logger.getLogger(StudentDao.class);
	
	public StudentDaoImpl() {
		logger.warn("student dao created");
		//System.out.println("student dao created");
	}
	
	@Override
	public boolean createStudent(StudentModel stu)throws Exception
	{
		//System.out.println("createstudent:dao called");
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(stu);
		tx.commit();
		session.close();
		logger.warn("create student : "+stu);
		return true;
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<StudentModel> listStudents() throws Exception {
		//System.out.println("liststudent:dao called");
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		List<StudentModel> list = session.createCriteria(StudentModel.class).list();
		tx.commit();
		session.close();
		logger.warn("list students");
		return list;
	}

	@Override
	public StudentModel getStudent(Integer id) throws Exception {
		//System.out.println("getstudent:dao called");
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		StudentModel student = (StudentModel)session.get(StudentModel.class,id);
		tx.commit();
		session.close();
		logger.warn("get student : "+student);
		return student;
	}

	@Override
	public boolean deleteStudent(Integer id) throws Exception {
		//System.out.println("deletestudent:dao called");
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		StudentModel student = new StudentModel(id, null);
		session.delete(student);
		tx.commit();
		session.close();
		logger.warn("delete student id: "+id);
		return true;
	}

	@Override
	public boolean updateStudent(StudentModel student) throws Exception {
		//System.out.println("updatestudent:dao called");
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(student);
		tx.commit();
		session.close();
		logger.warn("update student : "+student);
		return true;
	}
}
