package org.example;

import java.util.Scanner;

public class CompoundInterestCalculator {

	double principal, annualInterestRate, numberOfCompounds, years;
	
	public void acceptRecord () {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter initial investment amount: ");
        principal = scan.nextDouble();
        System.out.print("Enter annual interest rate (in %): ");
        annualInterestRate = scan.nextDouble();
        System.out.print("Enter number of times interest is compounded per year: ");
        numberOfCompounds = scan.nextDouble();
        System.out.print("Enter investment duration (in years): ");
        years = scan.nextDouble();   
        
        scan.close();
	}
	
	public double calculateFutureValue () {
		return principal * Math.pow(1 + (annualInterestRate / numberOfCompounds),numberOfCompounds * years);
	}
	
	 public void printRecord() {
	        double futureVal = calculateFutureValue();
	        double totalInterest = futureVal - principal;
	        System.out.print("Future Value in (₹) : "+futureVal);
	        System.out.print("		Total Interest Earned in (₹) : "+totalInterest);
	    }
	
	
	public static void main(String[] args) {
		 CompoundInterestCalculator calc = new CompoundInterestCalculator();
	        calc.acceptRecord();
	        calc.printRecord();
	}

}
