package com.bvk.service;

import java.util.List;

import com.bvk.dao.StudentDAO;
import com.bvk.dao.StudentDAOImpl;
import com.bvk.entity.Student;
import com.bvk.exception.StudentException;

public class StudentServiceImpl implements StudentService {
	private StudentDAO studentDAO;
	
	
	public StudentServiceImpl() {
		super();
		this.studentDAO = new StudentDAOImpl();
	}

	@Override
	public int insert(Student student) {
		int status = 0;
		try{
			status = studentDAO.insert(student);
		}catch(StudentException se){
			System.out.println(se.getMessage());
		}
		return status;
	}

	@Override
	public int update(Student student) {
		int status = 0;
		try{
			status = studentDAO.update(student);
		}catch(StudentException se){
			System.out.println(se.getMessage());
		}
		return status;
	}

	@Override
	public int delete(Student student) {
		int status = 0;
		try{
			status = studentDAO.delete(student);
		}catch(StudentException se){
			System.out.println(se.getMessage());
		}
		return status;
	}

	@Override
	public List<Student> getStudents() {
		List<Student>studentList = null;
		try{
			studentList = studentDAO.getStudents();
		}catch(StudentException se){
			System.out.println(se.getMessage());
		}
		return studentList;
	}

	@Override
	public Student getStudent(int studentId) {
		Student student = null;
		try{
			student = studentDAO.getStudent(studentId);
		}catch(StudentException se){
			System.out.println(se.getMessage());
		}
		return student;
	}
}