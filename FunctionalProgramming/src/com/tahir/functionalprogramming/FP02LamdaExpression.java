package com.tahir.functionalprogramming;

import java.util.List;

public class FP02LamdaExpression {

	public static void main(String[] args) {
		List<Integer> ls = List.of(1, 10, 9, 8, 15, 7, 9, 32);

		printAllNumbersLamdaExpression(ls);

	}

	public static void printAllNumbersLamdaExpression(List<Integer> numbers) {
		System.out.println("============Even============");
		numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
		System.out.println("============Odd============");
		numbers.stream().filter(number -> number % 2 != 0).forEach(System.out::println);
	}

}
