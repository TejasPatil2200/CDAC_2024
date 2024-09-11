package org.example.assignment4;

import java.util.Scanner;

class LoanAmortizationCalculator{
	private  float principal;
	private int annualInterestRate;
	private int loanTerm;

	public double getprincipal() {
		return principal;
	}
	
	public void setprincipal (float principal) {
		this.principal = principal;
	
	}
	
	public int getannualInterestRate() {
		return annualInterestRate;
	}
	
	public void setannualInterestRate(int annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public int getloanterm() {
		return loanTerm;
	}
	
	public void setloanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}
	
	public void acceptRecords () {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the principle amount: ");
		setprincipal(scan.nextFloat());
		
		System.out.println("Enter annual Interest Rate: ");
		setannualInterestRate(scan.nextInt());
		
		System.out.println("Enter loan Term :");
		setloanTerm(scan.nextInt());
		scan.close();
	}

	public double calMonthlyPayments() {
		
		int monthlyInterestRate = (getannualInterestRate() / 12 / 100) ;
		int numberOfMonths = getloanterm() * 12;
		double monthlyPayment = getprincipal() * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate,numberOfMonths)) / (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
		return monthlyPayment;
	}

	public void printRecord(double monthlyPayment) {
		
		int numberOfMonths = getloanterm() * 12;
		double totalPayment = monthlyPayment * numberOfMonths;
		
		System.out.println("Monthly Payment is : "+numberOfMonths);
		System.out.println("Total Payment over the life of loan is : "+totalPayment);
	}



	public static void main(String[] args) {
		
		LoanAmortizationCalculator lac = new LoanAmortizationCalculator();
		lac.acceptRecords ();
		double monthlyPayment = lac.calMonthlyPayments();
		lac.printRecord(monthlyPayment);
	}

}
