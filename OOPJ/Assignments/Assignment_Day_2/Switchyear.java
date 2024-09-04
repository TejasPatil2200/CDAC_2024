package pkg1;

import java.util.Scanner;

public class Switchyear {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the year to check it is leap or not ?");
		
		int year = scan.nextInt();
		
		switch (year % 4) {
		case 0:
		switch (year % 100) {
		case 0:
		switch (year % 400) {
		case 0:
			
		System.out.print(year+" is a leap year");
		break;
		default:
		System.out.print(year+" is not a leap year");
		break;
		}
		break;
		default:
		System.out.print(year+" is a leap year");
			break;
		}
		break;
		default:
			System.out.print(year+" is not a leap year");
	}
}}
