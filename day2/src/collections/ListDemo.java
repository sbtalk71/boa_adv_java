package collections;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
		//List<String> myList = new ArrayList<>();
		
		//List<String> myList = new LinkedList<>();
		
		List<String> myList = new Vector<>();
		
		myList.add("pavan");
		myList.add("kiran");
		myList.add("chandra");
		myList.add("mitali");
		myList.add("Karan");

		System.out.println(myList);

		// remove chandra
		myList.remove("chandra");
		System.out.println(myList);
		// add maria at 4th
		myList.add(4, "maria");
		// remove 3rd element
		myList.remove(3);
		// find mitali
		myList.contains("mitali");
		// add 'Charan' to 6th position
		myList.add(4, "Charan");

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
