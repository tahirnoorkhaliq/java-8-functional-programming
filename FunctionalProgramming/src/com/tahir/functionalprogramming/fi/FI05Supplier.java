package com.tahir.functionalprogramming.fi;

import java.util.UUID;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FI05Supplier {

	public static void main(String[] args) {
		
		Supplier<UUID> suplier=()->UUID.randomUUID();
		System.out.println(suplier.get());
		UnaryOperator<Integer> up=(x)-> 3*x;
		System.out.println(up.apply(10));
		
		Supplier<UUID> suppliera =new Supplier<UUID>() {
			
			@Override
			public UUID get() {
				// TODO Auto-generated method stub
				return UUID.randomUUID();
			}
		};
		System.out.println(suppliera.get());
		
		//Type inference is a Java compiler's ability to look at each method invocation and corresponding 
		//declaration to determine the type argument (or arguments) that make the invocation applicable
		
		//Lambda Expressions do not have an explicit type. Their type is inferred by looking at the target 
		//type of the context or situation. The Target-Type of an expression is the data type that the Java Compiler
		//expects depending on where the expression appears. Java 8 supports inference using Target-Type in a method context.
	}

}
