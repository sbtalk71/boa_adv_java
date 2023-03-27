package com.demo.inheritence;

public class InheritanceMain {

	public static void main(String[] args) {
		Employee emp= new Employee(101,"Clark",43000);

		System.out.println(emp.getDetails());
		
		
		Person john=new Employee(102, "John", 76000);
		System.out.println(john.getDetails());
		
		//Employee e2= (Employee)new Person(103,"Jake");
	}

}
