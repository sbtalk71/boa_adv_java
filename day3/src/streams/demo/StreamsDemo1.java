package streams.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo1 {

	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(1, 2, 3, 5, 6, 8, 9, 12, 45, 67, 82);
		// Print all numbers
		// numList.stream().forEach(a -> System.out.println(a));

		numList.stream().forEach(System.out::println);
		
		DataPrinter printer=new DataPrinter();
		numList.stream().forEach(printer::print);
		numList.stream().forEach(DataPrinter::print2);
		
		numList.stream().mapToInt(x->x*x).forEach(System.out::println);
		// add each even numbers to itself and further multiply each resultant number with 3
		//and calculate the sum of all numbers
		
		System.out.println(numList.stream().mapToInt(x->x+x).map(x->x*3).sum());
		
		//collect all the resultant numbers in a separate collection and print them on console
		numList.stream()
		.mapToInt(x->x+x)
		.map(x->x*3)
		.boxed()
		.collect(Collectors.toList())
		.stream()
		.forEach(System.out::println);;
		
		int result=numList.stream().mapToInt(x->x+x).reduce((x,y)->x+y).getAsInt();
		System.out.println(result);
		

	}

}

class DataPrinter {

	public void print(Object o) {
		System.out.println(o);
	}
	
	public static void print2(Object o) {
		System.out.println(o);
	}
}