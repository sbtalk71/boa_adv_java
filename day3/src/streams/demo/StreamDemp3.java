package streams.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class StreamDemp3 {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee(100, "Ranga", 45000, "male"));
		empList.add(new Employee(101, "Raji", 30000, "female"));
		empList.add(new Employee(102, "Pankaj", 25000, "male"));
		empList.add(new Employee(103, "Jyothi", 15000, "female"));
		empList.add(new Employee(104, "Pavan", 25000, "male"));
		empList.add(new Employee(105, "Jagan", 30000, "male"));
		empList.add(new Employee(106, "Varun", 25000, "male"));
		empList.add(new Employee(107, "Chatur", 35000, "male"));
		empList.add(new Employee(108, "Amit", 25000, "male"));
		empList.add(new Employee(109, "Kirti", 31000, "female"));
		
		//list the name of each employee
		empList.stream().map(e->e.getName()).forEach(System.out::println);
		
		//sort the employees based on name (asc order)
		empList.stream().map(e->e.getName()).sorted().forEach(System.out::println);
		
		//calculate the total salary of all the employees
		
		//list the salaries of all female employees with name
		
		//hike salary by 10000 for those with salary less than 30000 
		//and collect the employees with raised salary in new collection
		
		empList.stream()
		.filter(e->e.getSalary()<30000)
		.map(e->{e.setSalary(e.getSalary()+10000); return e;})
		.collect(Collectors.toList()).forEach(e->System.out.println(e.getName()+"-->"+e.getSalary()));
		

	}

}
