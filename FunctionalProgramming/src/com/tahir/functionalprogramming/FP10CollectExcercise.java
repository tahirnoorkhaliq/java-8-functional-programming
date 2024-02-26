package com.tahir.functionalprogramming;

import java.util.List;
import java.util.stream.Collectors;

public class FP10CollectExcercise {

	public static void main(String[] args) {
		List<Integer> ls = List.of(1, 10, 9, 8, 15, 7, 9, 32);
		List<Integer> doubleNumber=collectEvenNumber(ls);
		System.out.println(doubleNumber);
		System.out.println("==================================");
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices","Spring Boot", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");
		List<Integer> courseLength = printLengthsOfAllCourse(courses);
		System.out.println("courseLength : "+courseLength);
	}
	
	//Create a List with Even Numbers Filtered from the Numbers List
		private static List<Integer> collectEvenNumber(List<Integer> ls) {			
			return ls.stream().filter(n->n%2==0).collect(Collectors.toList());		
		}
		
		
		//Create a List with lengths of all course titles.
		private static List<Integer> printLengthsOfAllCourse(List<String> courses) {
			return courses.stream().map(s->s.length()).collect(Collectors.toList());
			
		}

}
