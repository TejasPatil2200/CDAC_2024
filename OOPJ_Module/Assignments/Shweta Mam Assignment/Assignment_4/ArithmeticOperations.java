package org.shweassignment4;

public class ArithmeticOperations {
	public static void main (String [] args) {
		int number1 = 20;
		float number2 = 35.8f;
		double number3 = 39.98;
		
		double result1 = number1+number2;
		double result2 = number2-number3;
		double result3 = number3*number1;
		
		System.out.println("Addition of Integer And Float is : "+result1);
		System.out.println("Subtraction of Float And Double is : "+result2);
		System.out.println("Multiplication of Double And integer is : "+result3);
	}
}
