package com.tahir.functionalprogramming.fi;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class FI03ExerciseBehaviorParameterization {

	public static void main(String[] args) {
		List<Integer> ls = List.of(1, 10, 9, 8, 15, 7, 9, 32);

		//Behavior of the method as Parameters
		extracted(ls, i->i%2==0);
		System.out.println("==========================");
		extracted(ls, i->i%2!=0);
	}

	private static void extracted(List<Integer> integerList, Predicate<? super Integer> predicate) {
		integerList.stream().filter(predicate).forEach(System.out::println);
	}

	
}
