package com.tahir.functionalprogramming.fi;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class StdCourse {
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;

	public StdCourse(String name, String category, int reviewScore, int noOfStudents) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public String toString() {
		return name + ":" + noOfStudents + ":" + reviewScore;
	}

}

public class FP13HighOrderFunction {

	public static void main(String[] args) {
		List<StdCourse> courses = List.of(new StdCourse("Spring", "Framework", 98, 20000),
				new StdCourse("Spring Boot", "Framework", 95, 18000), new StdCourse("API", "Microservices", 97, 22000),
				new StdCourse("Microservices", "Microservices", 96, 25000),
				new StdCourse("FullStack", "FullStack", 91, 14000), new StdCourse("AWS", "Cloud", 92, 21000),
				new StdCourse("Azure", "Cloud", 99, 21000), new StdCourse("Docker", "Cloud", 92, 20000),
				new StdCourse("Kubernetes", "Cloud", 91, 20000));

		Predicate<StdCourse> reviewScoreGreaterThan95Predicate2 = createPredicateWithCutoffReviewScore(95);

		Predicate<StdCourse> reviewScoreGreaterThan90Predicate2 = createPredicateWithCutoffReviewScore(90);
		
		System.out.println(courses.stream().allMatch(reviewScoreGreaterThan95Predicate2));
		System.out.println(courses.stream().filter(reviewScoreGreaterThan95Predicate2).collect(Collectors.toList()));
		System.out.println(courses.stream().filter(createPredicateWithCutoffReviewScore(80)).collect(Collectors.toList()));

	}

	private static Predicate<StdCourse> createPredicateWithCutoffReviewScore(int cutoffReviewScore) {
		return course -> course.getReviewScore() > cutoffReviewScore;
	}

}
