package com.tahir.functionalprogramming.fi;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FP10PremitiveStream {

	public static void main(String[] args) {
		System.out.println(IntStream.range(0, 5).sum());
		System.out.println(IntStream.rangeClosed(0, 5).sum());
		System.out.println(IntStream.iterate(1, i->i+2).limit(5).peek(System.out::println).sum());
		System.out.println(IntStream.iterate(2, i->i+2).limit(5).peek(System.out::println).sum());
		System.out.println(IntStream.iterate(2, i->i*2).limit(5).peek(System.out::println).sum());
		System.out.println(IntStream.iterate(2, i->i*2).limit(5).boxed().collect(Collectors.toList()));

	}

}
