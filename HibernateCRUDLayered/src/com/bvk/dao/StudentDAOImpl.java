package com.bvk.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bvk.entity.Student;
import com.bvk.exception.StudentException;

public class StudentDAOImpl implements StudentDAO {

	@Override
	public int insert(Student student) throws StudentException {
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			
			Transaction tx = session.beginTransaction();
			
			session.save(student);
			
			tx.commit();
			
			System.out.println("Record inserted...");
			}catch(Exception e){
				throw new StudentException(e.getMessage());
			}
		return 1;
	}

	@Override
	public int update(Student student) throws StudentException {
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			
			Transaction tx = session.beginTransaction();
			
			session.update(student);
			
			tx.commit();
			
			System.out.println("Record inserted...");
			}catch(Exception e){
				throw new StudentException(e.getMessage());
			}
		return 1;
	}

	@Override
	public int delete(Student student) throws StudentException {
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			
			Transaction tx = session.beginTransaction();
			
			session.delete(student);
			
			tx.commit();
			
			System.out.println("Record deleted...");
			}catch(Exception e){
				throw new StudentException(e.getMessage());
			}
		return 1;
	}

	@Override
	public List<Student> getStudents() throws StudentException {
		List<Student>students = null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			students = (List<Student>)session.createQuery("FROM Student").list();	
		}catch(Exception e){
			throw new StudentException(e.getMessage());
		}
		
		return students;
	}

	@Override
	public Student getStudent(int studentId) throws StudentException {
		Student student = null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			
			Transaction tx = session.beginTransaction();
			
			student = (Student)session.get(Student.class,new Integer(studentId));
			
			tx.commit();
			}catch(Exception e){
				System.out.println("Record couldn't be inserted..." + e.getMessage());
			}
		
		return student;
	}
}