package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<String> myList = new HashSet<>();
		
		myList.add("pavan");
		myList.add("kiran");
		myList.add("chandra");
		myList.add("mitali");
		myList.add("Karan");

		System.out.println(myList);

		// remove chandra
		myList.remove("chandra");
		System.out.println(myList);
		
		myList.remove(3);
		// find mitali
		myList.contains("mitali");
		myList.add("Karan");
		

		System.out.println(myList);

		Iterator<String> itr = myList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("For each demo below: ");
		for (String s : myList) {
			System.out.println(s);
		}
	}

}
