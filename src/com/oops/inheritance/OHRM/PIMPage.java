package com.oops.inheritance.OHRM;

public class PIMPage {

	// OBJECT PROPERTY FRAMEWORK

	String label = "PIM";

	// Emp Info 
	public void SearchEmpInfo() {
		int ID = 1234; // Emp ID
		System.out.println(ID);

		String JobTitle = "QA";
		System.out.println(JobTitle);

		String SearchEmpInfo = "Kart";
		System.out.println(SearchEmpInfo);

	}
	// Add Employee Button

	public void Add() {
		String EmpFullName = "Peter";
		System.out.println(EmpFullName);

		String EmpID = "2525";
		System.out.println(EmpID);

	}

	// Existing Employee List
	public void ExistingEmp() {
		String ID = "12123";
		System.out.println(ID);

		String FirstName = "King";
		System.out.println(FirstName);

		String LastName = "Charles";
		System.out.println(LastName);

		String EmpStatus = "FullTime";
		System.out.println(EmpStatus);

		String JobTitle = "QA";
		System.out.println(JobTitle);
	}

	// Header Tabs
	public void Label() {
		System.out.println(label);
	}
}
