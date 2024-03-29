package com.tahir.functionalprogramming.fi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FP09CreateStream {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 10, 9, 8, 15, 7, 9, 32);
		System.out.println(numbers.stream().reduce(0, Integer::sum));

		System.out.println(Stream.of(1, 10, 9, 8, 15, 7, 9, 32).reduce(0, Integer::sum));
		
		int[] numberArray= {1, 10, 9, 8, 15, 7, 9, 32};
		
		System.out.println(Arrays.stream(numberArray).reduce(0, Integer::sum));
		
		System.out.println(Arrays.stream(numberArray).average());
		System.out.println(Arrays.stream(numberArray).min());
		System.out.println(Arrays.stream(numberArray).max());
		
	}

}
