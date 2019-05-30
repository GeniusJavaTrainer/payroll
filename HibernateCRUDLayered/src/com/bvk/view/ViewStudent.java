package com.bvk.view;
import java.util.Scanner;

import com.bvk.entity.Student;

public class ViewStudent {
	public static int returnOption(){
		Scanner scInput = new Scanner(System.in);
		int choice = 0;
		
		System.out.println("Following are the options:");
		System.out.println("1. Insert Record");
		System.out.println("2. Update Record");
		System.out.println("3. Delete Record");
		System.out.println("4. View all records");
		System.out.println("5. View single record");
		System.out.println("0. Exit");
		
		choice = Integer.parseInt(scInput.nextLine());
		
		//scInput.close();
		
		return choice;
	}
	
	public static Student returnRecord(){
		Scanner scInput = new Scanner(System.in);
		
		Student student = null;
		
		int studentId = 0;
		String name = null;
		
		System.out.print("Student ID: ");
		studentId = Integer.parseInt(scInput.nextLine());
		
		System.out.print("Name: ");
		name = scInput.nextLine();
		
		student = new Student(studentId, name);
		
		//scInput.close();
		
		return student;
	}
	
	public static int returnID(){
		Scanner scInput = new Scanner(System.in);
		
		int studentId = 0;
		
		System.out.print("Student ID: ");
		studentId = Integer.parseInt(scInput.nextLine());
		
		//scInput.close();
		
		return studentId;
	}
}