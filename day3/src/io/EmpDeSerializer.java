package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import streams.demo.Employee;

public class EmpDeSerializer {

	public static void main(String[] args) {

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emp.ser"))) {
			Object obj = ois.readObject();
			Employee emp1 = (Employee) obj;
			System.out.println(emp1.getName());
			System.out.println("Emp Serialized");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
