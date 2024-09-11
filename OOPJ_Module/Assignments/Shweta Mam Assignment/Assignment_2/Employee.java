package org.example;

import java.util.Scanner;


class Employeedata{
	
	private String name;
	private int empid;
	private String address;
	private int salary;
	
	public void acceptdata() {
		Scanner scan = new Scanner (System.in);
		System.out.print("name :	 	");
		this.name = scan.nextLine();
		System.out.print("empid :	 	");
		this.empid = scan.nextInt();
		System.out.print("address :	 	");
		this.address = scan.nextLine();
		System.out.print("salary :	 	");
		this.salary = scan.nextInt();
		
		scan.close();
		
	}
	public void showdata() {
		System.out.println(this.name+ " / " + this.empid + " / " + this.address + " / " + this.salary +" / ");
	}
}

public class Employee {

	public static void main(String[] args) {
		Employeedata emp = new Employeedata();
		emp.acceptdata();
		emp.showdata();
		
	}
		
}
