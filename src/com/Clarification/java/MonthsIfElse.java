package com.Clarification.java;

import java.util.Scanner;

public class MonthsIfElse {
	public static void main(String[] args) {
		MonthsIfElse obj = new MonthsIfElse();
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter Month No:  ");
		int MonthNumber = s.nextInt();
		obj.PrintMonthName(MonthNumber);
	}

	public void PrintMonthName(int MonthNumber) {
		if (MonthNumber == 1) {
			System.out.println("Jan");
		} else if (MonthNumber == 2) {
			System.out.println("Feb");
		} else if (MonthNumber == 3) {
			System.out.println("Mar");
		} else if (MonthNumber == 4) {
			System.out.println("Apr");
		} else if (MonthNumber == 5) {
			System.out.println("May");
		} else if (MonthNumber == 6) {
			System.out.println("Jun");
		} else if (MonthNumber == 7) {
			System.out.println("Jul");
		} else if (MonthNumber == 8) {
			System.out.println("Aug");
		} else if (MonthNumber == 9) {
			System.out.println("Sep");
		} else if (MonthNumber == 10) {
			System.out.println("Oct");
		} else if (MonthNumber == 11) {
			System.out.println("Nov");
		} else if (MonthNumber == 12) {
			System.out.println("Dec");
		} else {
			System.out.println("Nope");
		}
		System.out.println("haha!! TASK ;)  DONE");
	}
}