package com.tahir.functionalprogramming;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FP09Collect {

	public static void main(String[] args) {
		List<Integer> ls = List.of(1, 10, 9, 8, 15, 7, 9, 32);
		List<Integer> doubleNumber=doubleList(ls);
		System.out.println(doubleNumber);

	}

	
	private static List<Integer> doubleList(List<Integer> ls) {
		// TODO Auto-generated method stub
		return ls.stream().map(n->n*n).collect(Collectors.toList());		
	}
	
	
	
	
}
