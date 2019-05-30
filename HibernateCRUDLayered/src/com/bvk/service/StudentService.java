package com.bvk.service;

import java.util.List;

import com.bvk.entity.Student;

public interface StudentService {
	int insert(Student student);
	int update(Student student);
	int delete(Student student);
	List<Student> getStudents();
	Student getStudent(int studentId);
}