package funtional.interfaces;

import java.util.Arrays;
import java.util.List;

public class DemoFunctionalInterfaces {

	public static void main(String[] args) {
		List<Integer> myList=Arrays.asList(1,3,4,67,9,23,12,43,56);
		
	Long count=	myList.stream().filter((t)->t.intValue()%2!=0).count();
	System.out.println(count);
	
	myList.stream().filter((t)->t%2!=0).forEach(x->System.out.println(x));
	
	myList.stream().filter((t)->t.intValue()%2!=0).max((x,y)->x.compareTo(y));
	//print all the numbers greater than 23
	//get the even number and sort them
	

	}

}

