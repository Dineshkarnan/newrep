package org.scanner;

import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee name");
		String empName = sc.nextLine();
		System.out.println(" Entered Employee Name is"+empName);
		
		float empSal = sc.nextFloat();
		System.out.println("Entered Employee Salary is:"+empSal);
		
		
	}

}
