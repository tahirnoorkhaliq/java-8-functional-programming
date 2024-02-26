package com.tahir.functionalprogramming;

import java.util.List;

public class FP01StructuredFunctionalApproach {

	public static void main(String[] args) {
		List<Integer> ls = List.of(1,10,9,8,15,7,9,32);
		printAllNumbers(ls);
		System.out.println("======================");
		printAllNumbersInFunctionalApproach(ls);

	}
 public static void printAllNumbers(List<Integer> numbers) {
	 for (Integer i : numbers) {
		 System.out.println(i);
		
	}
 }
 public static void printAllNumbersInFunctionalApproach(List<Integer> numbers) {
	numbers.stream().forEach(System.out::println);
 }
}
