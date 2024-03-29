package com.tahir.functionalprogramming;

import java.util.List;

public class FP03Exercise {

	public static void main(String[] args) {
		List<Integer> ls = List.of(1, 10, 9, 8, 15, 7, 9, 32);
		printAllNumbersLamdaExpression(ls);
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");

		printAllNumbersLamdaExpressiononCourses(courses);

	}

	public static void printAllNumbersLamdaExpression(List<Integer> ls) {
		System.out.println("============Even============");
		ls.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
		System.out.println("============Odd============");
		ls.stream().filter(number -> number % 2 != 0).forEach(System.out::println);
	}

	public static void printAllNumbersLamdaExpressiononCourses(List<String> courses) {
		System.out.println("Print All Courses individually");
		courses.stream().forEach(System.out::println);
		System.out.println("Print Courses Containing the word \"Spring\"");
		courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
		System.out.println("Print Courses Whose Name has atleast 4 letters");
		courses.stream().filter(course -> course.length() <= 4).forEach(System.out::println);
	}

}
