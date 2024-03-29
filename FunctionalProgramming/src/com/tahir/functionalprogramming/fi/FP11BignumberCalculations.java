package com.tahir.functionalprogramming.fi;

import java.math.BigInteger;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class FP11BignumberCalculations {

	public static void main(String[] args) {
		//IntBinaryOperator op = (x,y)->{System.out.println(x+" : "+y);return x*y;};
		System.out.println(IntStream.rangeClosed(1, 10).reduce(1, (x, y) -> {
			System.out.println(x + " : " + y);
			return x * y;
		}));
		System.out.println(LongStream.rangeClosed(1, 20).reduce(1, (x, y) -> {
			System.out.println(x + " : " + y);
			return x * y;
		}));
		
		//BinaryOperator<BigInteger> accumulator = BigInteger::multiply;
		BinaryOperator<BigInteger> accumulator =new BinaryOperator<BigInteger>() {
			
			@Override
			public BigInteger apply(BigInteger t, BigInteger u) {
				
				return t.multiply(u);
			}
		};
		System.out.println("=== "+LongStream.rangeClosed(1, 5).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, accumulator));
		

	}

}
