package com.tahir.functionalprogramming;

import java.util.List;

public class FP04Map {
	public static void main(String[] args) {
		List<Integer> ls = List.of(1, 10, 9, 8, 15, 7, 9, 32);

		printSquareOfAllNumbersLamdaExpression(ls);

	}

	public static void printSquareOfAllNumbersLamdaExpression(List<Integer> numbers) {
		System.out.println("============numbers============"+numbers);
		System.out.println("============Even============");
		numbers.stream().filter(number -> number % 2 == 0).map(number -> number * 2 ).forEach(System.out::println);
		System.out.println("============Odd============");
		numbers.stream().filter(number -> number % 2 != 0).map(number -> number * 2 ).forEach(System.out::println);
	}

}
