package com.tahir.functionalprogramming.fi;

import java.util.ArrayList;
import java.util.List;

public class FP16ReplaceAllRemoveIf {

	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");
     // courses.replaceAll(str->str.toUpperCase());
      List<String> modCourses=new ArrayList<String>(courses);
      
      modCourses.replaceAll(str->str.toUpperCase());
      System.err.println(modCourses);

	}

}
