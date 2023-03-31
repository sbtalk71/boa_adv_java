package threads.fj;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class AddFromListMain {

	public static void main(String[] args) {
		ForkJoinPool fjp=new ForkJoinPool(6);
		List<Integer> numList=Arrays.asList(1,2,3,4,5,6,7);
		
		int result=fjp.invoke(new AddFromList(numList)); 
		System.out.println(result);

	}

}
