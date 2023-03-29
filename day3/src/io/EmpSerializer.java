package io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import streams.demo.Employee;

public class EmpSerializer {

	public static void main(String[] args) throws Exception {

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.ser"));
		
		Employee emp1= new Employee(100, "Shantanu", 45000, "male");
		
		oos.writeObject(emp1);
		
		System.out.println("Emp Serialized");

	}

}
