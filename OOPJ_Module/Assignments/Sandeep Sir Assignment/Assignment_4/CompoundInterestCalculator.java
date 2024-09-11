package org.example.assignment4;

import java.util.Scanner;

public class CompoundInterestCalculator {

	private float principal;
	private int annualInterestRate;
	private float numberOfCompounds;
	private int years;
	
	public float getprincipal() {
	return principal;
	}
	public void setprincipal(float principal) {
		this.principal=principal;
	}
	public int getannualInterestRate() {
		return annualInterestRate;
	}
	public void setannualInterestRate(int annualInterestRate) {
		this.annualInterestRate=annualInterestRate;
	}
	public float getnumberOfCompounds() {
		return numberOfCompounds; 
	}
	public void setnumberOfCompounds(float numberOfCompounds) {
		this.numberOfCompounds=numberOfCompounds;
	}
	public int getyears() {
		return years;
	}
	public void setyears(int years) {
		this.years=years;
	}
	
	public void acceptRecords() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Initial Investment Value : ");
		setprincipal(scan.nextFloat());
		System.out.println("Enter The Annual Interest Rate Value : ");
		setannualInterestRate(scan.nextInt());
		System.out.println("Enter The Compound Amount : ");
		setnumberOfCompounds(scan.nextFloat());
		System.out.println("Enter The Number Of Years : ");
		setyears(scan.nextInt());
		scan.close();
	}
	public double calculateFutureValue() {
        
        double rateAsDecimal = getannualInterestRate() / 100;

        
        double futureValue = getprincipal() * 
            Math.pow((1 + rateAsDecimal / getnumberOfCompounds()), 
            getnumberOfCompounds() * getyears());

        return futureValue;
	}
    public void printRecord(double futureValue) {
        
        double totalInterest = futureValue - getprincipal();

        System.out.printf("Future Value: ", +futureValue);
        System.out.printf("Total Interest Earned: "  +totalInterest);
    }
	
	public static void main(String[] args) {
		CompoundInterestCalculator calc = new CompoundInterestCalculator();

        
        calc.acceptRecords();

        double futureValue = calc.calculateFutureValue();

        calc.printRecord(futureValue);
	}

}
