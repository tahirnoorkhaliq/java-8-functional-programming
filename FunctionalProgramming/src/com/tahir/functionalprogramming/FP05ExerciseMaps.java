package com.tahir.functionalprogramming;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FP05ExerciseMaps {

	public static void main(String[] args) {
		List<Integer> ls = List.of(1, 10, 9, 8, 15, 7, 9, 32);
		printCubeOfAllNumbersLamdaExpression(ls);
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");

		printAllStringLamdaExpressiononCourses(courses);

	}

	public static void printCubeOfAllNumbersLamdaExpression(List<Integer> ls) {		
		System.out.println("============Print the cubes of odd numbers============");
		ls.stream().filter(number -> number % 2 != 0).map(number -> number * number * number).forEach(System.out::println);
	}

	public static void printAllStringLamdaExpressiononCourses(List<String> courses) {
		System.out.println("Print the number of characters in each course name");	
		Map<String, Integer> ss = courses.stream().filter(Objects::nonNull)
	    .distinct()
	    .collect(Collectors.toMap(Function.identity(), String::length));
		System.out.println(ss);
		courses.stream().map(course->course.length()).forEach(System.out::println);
		System.out.println(courses.stream().map(course->course.length()).collect(Collectors.toList()));
	}


}
