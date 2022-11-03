package com.Clarification.java;

import java.util.Scanner;

public class ExampleIfCondition {
public static void main(String[] args) {
	
	/*
	 * Scanner scan=new Scanner(System.in);
	 * System.out.println("Enter the number: "); //reading value from the user int
	 * marks=scan.nextInt();
	 */
	
	ExampleIfCondition obj=new ExampleIfCondition();
	obj.printResult(15);
}

public void printResult(int marks) {
	if (marks>=35) {
		System.out.println("pass");
	}else {
		System.out.println("fail");
	}
}

public void printResult2(int marks) {
	if(marks>35&& marks <60) {
		System.out.println("Second Class Pass");
		}else if(marks>60&&marks<70) {
			System.out.println("First Class Pass");
		}else if (marks>70) {
			System.out.println("Distinction");
		}else {
			System.out.println("Fail");
		}
}
}
