package com.Clarification.java;

import java.util.Scanner;

public class MonthsSwitchCases {
	public static void main(String[] args) {
		MonthsSwitchCases obj = new MonthsSwitchCases();
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter Month No:");
		int MonthNumber = s.nextInt();
		obj.PrintMonthName(MonthNumber);
	}
	public void PrintMonthName(int MonthNumber) {
		switch (MonthNumber) {
		case 1:
			System.out.println("Jan");
			break;
		case 2:
			System.out.println("Feb");
			break;
		case 3:
			System.out.println("Mar");
			break;
		case 4:
			System.out.println("Apr");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("Jun");
			break;
		case 7:
			System.out.println("Jul");
			break;
		case 8:
			System.out.println("Aug");
			break;
		case 9:
			System.out.println("Sep");
			break;
		case 10:
			System.out.println("Oct");
			break;
		case 11:
			System.out.println("Nov");
			break;
		case 12:
			System.out.println("Dec");
			break;
		default:
			System.out.println(" :P ");
			break;
		}
		System.out.println("*HOPE YOU GOT IT!!*");
	}
}

