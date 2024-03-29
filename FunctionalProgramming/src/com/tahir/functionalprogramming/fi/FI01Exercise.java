package com.tahir.functionalprogramming.fi;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FI01Exercise {

	public static void main(String[] args) {
		List<Integer> ls = List.of(1, 10, 9, 8, 15, 7, 9, 32);

		printSquareOfAllNumbersLamdaExpression(ls);

	}

	public static void printSquareOfAllNumbersLamdaExpression(List<Integer> numbers) {
		
		 numbers.stream().filter(number -> number % 2 == 0)
								 .map(number -> number * number )
								 .forEach(System.out::println);
		 System.out.println("=========================================");
		Predicate<Integer> evenPredicate = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t % 2 == 0;
			}
		};

		Function<Integer, Integer> squareMapper = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {

				return t * t;
			}
		};

		
		Consumer<Integer> printAction = new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
		};
		
		 Predicate<Integer> evenPredicateFP = number -> number % 2 == 0;

		 Function<Integer,Integer> squareMapperFP = number -> number * number;

		Consumer<Integer> printActionFP = System.out::println;

		numbers.stream().filter(evenPredicate).map(squareMapper).forEach(printAction);
		System.out.println("=========================================");
		numbers.stream().filter(evenPredicateFP).map(squareMapperFP).forEach(printActionFP);

	}

}
