package com.bvk.dao;

import java.util.List;

import com.bvk.entity.Student;
import com.bvk.exception.StudentException;

public interface StudentDAO {
	int insert(Student student) throws StudentException;
	int update(Student student) throws StudentException;
	int delete(Student student) throws StudentException;
	List<Student> getStudents() throws StudentException;
	Student getStudent(int studentId) throws StudentException;
}