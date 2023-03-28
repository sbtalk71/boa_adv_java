package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeMapDemo {

	public static void main(String[] args) {
		Map<Integer,Employee> empMap=new HashMap<>();
		
		empMap.put(100,new Employee(100, "Ranga", 35000, "male"));
		empMap.put(101,new Employee(101, "Chandra", 35000, "male"));
		empMap.put(102,new Employee(102, "Pankaj", 35000, "male"));
		empMap.put(103,new Employee(103, "Dinesh", 35000, "male"));
		empMap.put(104,new Employee(104, "Pavan", 35000, "male"));
		empMap.put(105,new Employee(105, "Jagan", 35000, "male"));
		empMap.put(106,new Employee(106, "Varun", 35000, "male"));
		empMap.put(107,new Employee(107, "Chatur", 35000, "male"));
		empMap.put(108,new Employee(108, "Amit", 35000, "male"));
		//empMap.put(101,new Employee(101, "Chandra", 35000, "male"));
		
		empMap.put(109,new Employee(109, "Kirti", 35000, "female"));
		
		System.out.println(empMap);
		
		System.out.println(empMap.get(104));
		empMap.remove(104);
		
		Set<Integer> keys=empMap.keySet();
		for(Integer id: keys) {
			System.out.println(id+" ---> "+empMap.get(id));
		}
		
	}

}


