package com.tahir.functionalprogramming.fi;

import java.util.List;
import java.util.function.BinaryOperator;

public class FI02ExerciseIntegerSum {

	public static void main(String[] args) {
		List<Integer> ls = List.of(1, 10, 9, 8, 15, 7, 9, 32);

		System.err.println(addListElementsFP(ls));
	}

	private static int addListElementsFP(List<Integer> ls) {
		System.out.println(ls.stream().reduce(0, Integer::sum));

		BinaryOperator<Integer> accumulator = Integer::sum;

		BinaryOperator<Integer> accumulatorFI = new BinaryOperator<Integer>() {

			//function descriptor
			@Override
			public Integer apply(Integer t, Integer u) {
				return t + u;
			}
		};
		System.out.println(ls.stream().reduce(0, accumulator));

		return ls.stream().reduce(0, accumulatorFI);

	}
}
