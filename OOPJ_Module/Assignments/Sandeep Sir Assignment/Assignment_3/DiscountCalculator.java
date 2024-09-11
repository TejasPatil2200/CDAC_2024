package org.example;

import java.util.Scanner;

public class DiscountCalculator {
	float orignalPrice, discountRate;
	
	public void acceptRecord() {
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter the Orignal Price of the item : ");
		orignalPrice = scan.nextFloat();
		System.out.print("Enter the Discount Rate in (Percent %)");
		discountRate = scan.nextFloat();
		scan.close();
	}
	
	public float calculateDiscount() {
		return orignalPrice * (discountRate / 100);
	}
	
	public void printRecord () {
		float discountAmount = calculateDiscount();
		float finalPrice = orignalPrice - discountAmount;
		System.out.printf("Discount Amount: "+discountAmount);
	    System.out.print("		Final Price: "+finalPrice);
	}
	
	public static void main (String [] args) {
		  DiscountCalculator calc = new DiscountCalculator();
	        calc.acceptRecord();
	        calc.printRecord();
	}
}
