package com.tahir.functionalprogramming.fi;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.IntBinaryOperator;

public class FI06BiPredicate {

	public static void main(String[] args) {
		
		
		BiPredicate<Integer, String> bp = (number, string) -> {
			return number < 10 && string.length() > 5;
		};

		System.out.println(bp.test(9, "TahirNoor"));

		BiFunction<Integer, String, String> bf = (number, str) -> {
			return number + " = " + str;
		};
		System.out.println(bf.apply(9, "TahirNoor"));

		BiConsumer<String, Integer> bc = (str, number) -> {
			System.out.println(str + " = " + number);
		};
		bc.accept("TahirNoor", 9);
		IntBinaryOperator ibo=(a,b)-> a+b;
		System.out.println(ibo.applyAsInt(1, 2));
	}

}
