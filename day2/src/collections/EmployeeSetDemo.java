package collections;

import java.util.HashSet;
import java.util.Set;

public class EmployeeSetDemo {

	public static void main(String[] args) {
		Set<Employee> empList=new HashSet<>();
		empList.add(new Employee(100, "Ranga", 35000, "male"));
		empList.add(new Employee(101, "Chandra", 35000, "male"));
		empList.add(new Employee(102, "Pankaj", 35000, "male"));
		empList.add(new Employee(103, "Dinesh", 35000, "male"));
		empList.add(new Employee(104, "Pavan", 35000, "male"));
		empList.add(new Employee(105, "Jagan", 35000, "male"));
		empList.add(new Employee(106, "Varun", 35000, "male"));
		empList.add(new Employee(107, "Chatur", 35000, "male"));
		empList.add(new Employee(108, "Amit", 35000, "male"));
		empList.add(new Employee(102, "Pankaj", 35000, "male"));
		empList.add(new Employee(109, "Kirti", 35000, "female"));
		
		System.out.println(empList);
		
	}

}


