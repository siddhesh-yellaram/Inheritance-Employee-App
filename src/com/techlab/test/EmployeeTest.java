package com.techlab.test;

import com.techlab.model.Student;
import com.techlab.model.Programmer;

public class EmployeeTest {

	public static void main(String[] args) {
		Student e1 = new Student(101,"Alex",25000);
		Programmer p1 = new Programmer(105,"Becky",30000,2500);
		createEmployee(e1);
		createProgrammer(p1);
	}
	
	public static void createEmployee(Student obj) {
		System.out.println("\nEmployee Id: "+obj.getId());
		System.out.println("Employee Name: "+obj.getName());
		System.out.println(obj.getName()+" Salary: "+obj.getSalary());
	}
	
	public static void createProgrammer(Programmer p1) {
		System.out.println("\nProgrammer Id: "+p1.getId());
		System.out.println("Programmer Name: "+p1.getName());
		System.out.println(p1.getName()+" Salary: "+p1.getId());
		System.out.println(p1.getName()+" Bonus: "+p1.getBonus());
	}

}
