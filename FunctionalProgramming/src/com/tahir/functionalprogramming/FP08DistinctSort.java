package com.tahir.functionalprogramming;

import java.util.Comparator;
import java.util.List;

public class FP08DistinctSort {

	public static void main(String[] args) {
		List<Integer> ls = List.of(1, 10, 9, 8, 15, 7,1,9,8, 9, 32);

		printDistinctNumbersLamdaExpression(ls);
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices","Spring Boot", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");

		printDistinctSortedStringsLamdaExpressiononCourses(courses);
		printSortedStringsLamdaExpressiononCourses(courses);
		System.out.println("===================");
		printSortedCompatorStringsLamdaExpressiononCourses(courses);
	}

	private static void printDistinctSortedStringsLamdaExpressiononCourses(List<String> courses) {
		courses.stream().distinct().sorted().forEach(System.out::println);
		
	}

	private static void printDistinctNumbersLamdaExpression(List<Integer> ls) {
		ls.stream().distinct().sorted().forEach(System.out::println);
		
	}
	
	private static void printSortedStringsLamdaExpressiononCourses(List<String> courses) {
		courses.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
	}
	
	private static void printSortedCompatorStringsLamdaExpressiononCourses(List<String> courses) {
		courses.stream().sorted(Comparator.comparing(str->str.length())).forEach(System.out::println);
		
	}
	
	

}
