package com.tahir.functionalprogramming.fi;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FI04ExerciseBehaviorParameterizationforMap {

	public static void main(String[] args) {
		List<Integer> ls = List.of(1, 10, 9, 8, 15, 7, 9, 32);

		// Function<? super Integer, ? extends Integer> mapper = x -> x*x;
		List<Integer> squareList = extracted(ls, x -> x * x);
		List<Integer> cubeList = extracted(ls, x -> x * x * x);
		System.out.println(squareList);
		System.out.println("=======================");
		System.out.println(cubeList);

		// Behavior of the method as Parameters

	}

	private static List<Integer> extracted(List<Integer> integerList,
			Function<Integer,Integer> mapper) {
		return integerList.stream().map(mapper).collect(Collectors.toList());
	}

}
