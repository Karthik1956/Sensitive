package com.Clarification.java;

public class SwapXY {
	public static void main(String[] args) {
		
		
		//Swap without Third Variable
		int x=10,y=14;
		
		x=x+y;
		
		y=x-y;
		System.out.println("y value is:"+y);
		x=x-y;
		System.out.println("x value is:"+x);
		
			
		//Swap with Third Variable
		
		int a=5,b=6,c;
		c=a;
		a=b;
		System.out.println("a value is:"+a);
		b=c;
		System.out.println("b value is:"+b);
		
		
		
	}

}
