package com.oops.inheritance;

public class A extends C {

	static int ID = 12345;
	static String Name = "Kart";
	static String Password = "Kart123";

	public static void testLogin() {
		System.out.println("Enter User ID :" + ID);
		System.out.println("Enter Password :"+ Password);
	}
	public  void testLogin2() {
		course();
		System.out.println("Enter User ID :" + ID);
		System.out.println("Enter Password :"+ Password);
}
}
