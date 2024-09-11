package org.example.assignment4;

import java.util.Scanner;

public class DiscountCalculator {
	float orignalPrice, discountRate;
	
	public float getOrignalPrice() {
		return orignalPrice;
	}

	public void setOrignalPrice(float orignalPrice) {
		this.orignalPrice = orignalPrice;
	}

	public float getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(float discountRate) {
		this.discountRate = discountRate;
	}

	public void acceptRecord() {
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter the Orignal Price of the item : ");
		setOrignalPrice(scan.nextFloat());
		System.out.print("Enter the Discount Rate in (Percent %)");
		setDiscountRate(scan.nextFloat());
		scan.close();
	}
	
	public float calculateDiscount() {
		return getOrignalPrice() * (getDiscountRate() / 100);
	}
	
	public void printRecord () {
		float discountAmount = calculateDiscount();
		float finalPrice = getOrignalPrice() - discountAmount;
		System.out.printf("Discount Amount: "+discountAmount);
	    System.out.print("		Final Price: "+finalPrice);
	}
	
	public static void main (String [] args) {
		  DiscountCalculator calc = new DiscountCalculator();
	        calc.acceptRecord();
	        calc.printRecord();
	}
}
