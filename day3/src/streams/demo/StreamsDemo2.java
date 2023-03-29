package streams.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo2 {

	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("shanker","shantanu","pavan","ranga","viren","chandra","srinivas","varun","chatur");
	
		//add a prefix "Welcome" to all those names which has length >5 and collect them in a new collection
		//print all greeted names
		names.stream().filter(x->x.length()>5).map(x->"Welcome "+x).collect(Collectors.toList()).forEach(System.out::println);
		
		
		//count the number of letters in each word and collect the result in a collection
		names.stream().mapToInt(x->x.length()).boxed().collect(Collectors.toList()).forEach(System.out::println);
		
	}

}

