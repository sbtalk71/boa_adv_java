package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeListDemo {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee(100, "Ranga", 35000, "male"));
		empList.add(new Employee(101, "Chandra", 35000, "male"));
		empList.add(new Employee(102, "Pankaj", 35000, "male"));
		empList.add(new Employee(103, "Dinesh", 35000, "male"));
		empList.add(new Employee(104, "Pavan", 35000, "male"));
		empList.add(new Employee(105, "Jagan", 35000, "male"));
		empList.add(new Employee(106, "Varun", 35000, "male"));
		empList.add(new Employee(107, "Chatur", 35000, "male"));
		empList.add(new Employee(108, "Amit", 35000, "male"));
		empList.add(new Employee(109, "Kirti", 35000, "female"));
		
		System.out.println(empList);
		
		//Collections.sort(empList,new EmpSorter());
		//Collections.sort(empList,(e1,e2)->e1.getName().compareTo(e2.getName()));
		Collections.sort(empList,(e1,e2)->{
										String name1=e1.getName();
										String name2=e2.getName();
										return name1.compareTo(name2);}
						);
		System.out.println(empList);
	}

}

/*
 * class EmpSorter implements Comparator<Employee>{
 * 
 * @Override public int compare(Employee e1, Employee e2) {
 * 
 * return e1.getName().compareTo(e2.getName()); } }
 */
