package com.bvk.controller;

import java.util.List;

import com.bvk.entity.Student;
import com.bvk.service.StudentService;
import com.bvk.service.StudentServiceImpl;
import com.bvk.view.ViewStudent;

public class StudentController {

	public static void main(String[] args) {
	int choice = -1;
	int result = 0;
	
	Student student = null;
	StudentService ss = new StudentServiceImpl();
	
	while(choice != 0){
		choice = ViewStudent.returnOption();
		
		switch(choice){
		case 1:
			student = ViewStudent.returnRecord();
			result = ss.insert(student);
			
			if(result != 1){
				System.out.println("Record not inserted.");
			}else{
				System.out.println("Record inserted successfully.");
			}
			break;
		case 2:
			student = ViewStudent.returnRecord();
			result = ss.update(student);
			
			if(result != 1){
				System.out.println("Record not updated.");
			}else{
				System.out.println("Record updated successfully.");
			}
			break;
		case 3:
			student = ViewStudent.returnRecord();
			result = ss.delete(student);
			
			if(result != 1){
				System.out.println("Record not deleted.");
			}else{
				System.out.println("Record deleted successfully.");
			}
			break;
		case 4:
			List<Student>students = ss.getStudents();
			for (Student studentOne : students) {
				System.out.println(studentOne);
			}
			break;
		case 5:
			int studentID = ViewStudent.returnID();
			student = ss.getStudent(studentID);
			System.out.println(student);
			break;
		default:
			break;
		}//switch
	}//while
	System.out.println("Bye!");
	}
}