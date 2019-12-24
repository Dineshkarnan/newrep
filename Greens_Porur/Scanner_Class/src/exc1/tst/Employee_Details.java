package exc1.tst;

import java.util.Scanner;

public class Employee_Details {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The employee Id");
		int empId = sc.nextInt();
		System.out.println("Entered employee id is" +empId);
		
		String empName = sc.next();
		System.out.println("Employee Name" + empName);
		
		String empmail = sc.next();
		System.out.println("Employee mail id " + empmail);
		
		long empNo = sc.nextLong();
		System.out.println("Employee Phone No " + empNo);
	}

}
