package com.tahir.functionalprogramming.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FP01Files {

	public static void main(String[] args) {
		try {
			Files.lines(Paths.get("file.txt")).map(str->str.split(" ")).flatMap(Arrays::stream).distinct().sorted().forEach(System.out::println);
			Files.list(Paths.get(".")).forEach(System.out::println);
			System.out.println("===========isDirectory=============");
			Files.list(Paths.get(".")).filter(Files::isDirectory).forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};

	}

}