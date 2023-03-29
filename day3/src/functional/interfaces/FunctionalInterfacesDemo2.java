package functional.interfaces;

import java.lang.reflect.Method;
import java.util.function.BiFunction;
import java.util.function.IntPredicate;
import java.util.function.ToIntBiFunction;

public class FunctionalInterfacesDemo2 {

	public static void main(String[] args) {

		int[] nums = { 1, 3, 4, 6, 7, 8, 12, 20 };

		IntPredicate p = x -> x % 2 == 0;
		//System.out.println(p);
		
		//Method[] methods=p.getClass().getMethods();
		
		//System.out.println(methods[0].getName());

		for (int i = 0; i < nums.length; i++) {
			if (p.test(nums[i]))
				System.out.println(nums[i] + " is Even ");
		}

		// implement BiFunction to add 2 numbers

		BiFunction<Integer, Integer, Integer> f = (a, b) -> a + b;

		System.out.println(f.apply(6, 9));

		//implement ToIntBiFunction
		ToIntBiFunction<Integer, Integer> tbf = (a, b) -> a + b;

		System.out.println(f.apply(6, 9));

	}

}
