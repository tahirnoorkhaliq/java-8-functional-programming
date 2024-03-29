package com.tahir.functionalprogramming.fi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FI07MethodReferencing {

	public static void main(String[] args) {

		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "Spring Boot", "AWS", "PCF",
				"Azure", "Docker", "Kubernetes");
		Function<String, String> identity = Function.identity();
		Map<String, Object> ssS = courses.stream().distinct().collect(Collectors.toMap(identity, String::toUpperCase));
		Map<String, Object> ss = courses.stream().distinct().collect(Collectors.toMap(t -> t, String::toUpperCase));
		System.out.println(ss);
		System.out.println(ssS);
		courses.stream().
		//map(s -> s.toUpperCase()).
		map(String::toUpperCase).
		forEach(str -> System.out.println(str));
		Supplier<ArrayList<String>> supplier=ArrayList::new;
	
	}

}
