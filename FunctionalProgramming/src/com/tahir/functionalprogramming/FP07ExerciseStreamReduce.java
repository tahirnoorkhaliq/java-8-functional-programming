package com.tahir.functionalprogramming;

import java.util.List;

public class FP07ExerciseStreamReduce {

	public static void main(String[] args) {
		List<Integer> ls = List.of(2, 10,3,9);
		System.out.println(printSquareOfAllNumbersLamdaExpression(ls));
		System.out.println(printCubeOfAllNumbersLamdaExpression(ls));
		System.out.println(printSumOfOddNumbersLamdaExpression(ls));

	}

	// Square every number in a list and find the sum of squares
	public static int printSquareOfAllNumbersLamdaExpression(List<Integer> ls) {
		System.out.println("============Print the cubes of odd numbers============");
		return ls.stream().map(number -> number * number).reduce(0, Integer::sum);
	}

	// Cube every number in a list and find the sum of cubes
	public static int printCubeOfAllNumbersLamdaExpression(List<Integer> ls) {
		System.out.println("============Print the cubes of odd numbers============");
		return ls.stream().map(number -> number * number * number).reduce(0, Integer::sum);
	}
	//Find Sum of Odd Numbers in a list
	public static int printSumOfOddNumbersLamdaExpression(List<Integer> ls) {		
		return ls.stream().filter(number -> number % 2 != 0).reduce(0, Integer::sum);
	}

}
