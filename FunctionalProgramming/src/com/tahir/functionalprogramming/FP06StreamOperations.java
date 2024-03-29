package com.tahir.functionalprogramming;

import java.util.List;

public class FP06StreamOperations {

	public static void main(String[] args) {
		List<Integer> ls = List.of(1, 10, 9, 8, 15, 7, 9, 32);
		System.out.println(addListElements(ls));
		System.err.println(addListElementsLamda(ls));
		System.err.println(addListElementsFP(ls));
	}

	public static int sum(int aggregate, int next) {
		return aggregate + next;
	}

	private static int addListElements(List<Integer> ls) {
		return ls.stream().reduce(0, FP06StreamOperations::sum);

	}
	private static int addListElementsLamda(List<Integer> ls) {
		return ls.stream().reduce(0, (a,b)-> a+b);

	}
	private static int addListElementsFP(List<Integer> ls) {
		return ls.stream().reduce(0, Integer::sum);

	}

}
