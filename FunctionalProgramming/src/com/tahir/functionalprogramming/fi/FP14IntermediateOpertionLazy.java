package com.tahir.functionalprogramming.fi;

import java.util.List;

public class FP14IntermediateOpertionLazy {

	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");
		System.out.println(courses.stream().peek(System.out::println).filter(course -> course.length() > 11)
				.map(String::toUpperCase).peek(System.out::println).findFirst());

	}

}
