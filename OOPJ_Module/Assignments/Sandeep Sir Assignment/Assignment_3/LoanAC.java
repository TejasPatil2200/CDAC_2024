package org.example;

import java.util.Scanner;

class LoanAmortizationCalculator{
		private float principal;
		private int anninterestrate;
		private int loanterm;
		private double monthlyPayment;
		
		public void acceptRecord() {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter the principle amount :  	"); 
			this.principal = (float) scan.nextFloat();
			System.out.print("Enter the interestrate amount :  	"); 
			this.anninterestrate = scan.nextInt();
			System.out.print("Enter the loantime amount :  	"); 
			this.loanterm = scan.nextInt();
			
			scan.close();
		}
		
		
		public void calculateMontlypayment() {
			int monintrestrate = (this.anninterestrate / 12 /100);
			 int numofmonths = (this.loanterm * 12);
			this.monthlyPayment = this.principal * ( monintrestrate * (1 + monintrestrate) ^ (numofmonths)) / ((1 + monintrestrate) ^ (numofmonths) - 1);
		}
		
		public void printrec () {
			System.out.println("The amount paid over life of the loan is :" + monthlyPayment);
		}
}

public class LoanAC {

	public static void main(String[] args) {
		
		LoanAmortizationCalculator lac = new LoanAmortizationCalculator();
		lac.acceptRecord();
		lac.calculateMontlypayment();
		lac.printrec();
	}

}
