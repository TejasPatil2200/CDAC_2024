package org.shweassignment4;

public class NarrowingConversion {
	public static void main (String [] args) {
		double number = 12.435;
		System.out.println("The value before performing Narrowing Operation : "+number);
		int result = (int) number;
		System.out.println("The value after performing Narrowing Operation : "+result);
	}
}
