package com.Clarification.java;

public class ConveetVarType {
public static void main(String[] args) {
	
	int a=14;
	double b=a; //Automatic casting: Int to Double
	
	System.out.println(a); //Output: 14
	System.out.println(b); //Output: 14.0
	
	double a1=7.98;
	double a2=5.1;
	
	int b1=(int)a1; //Manual Casting: Double to Int
	
	System.out.println(a1);
	System.out.println(b1);
	
	System.out.println(Math.floor(a1));// Output: 7 bcz of floor fn (Downgraded)
	System.out.println(Math.ceil(a2));// Output: 6 bcz of floor fn (Upgraded)
}
}
