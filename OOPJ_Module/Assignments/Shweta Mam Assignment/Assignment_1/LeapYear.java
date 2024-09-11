package pkg1;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner year = new Scanner (System.in);
		System.out.println("Enter the Year to find if its leap or not..");
		int Noyear = year.nextInt();
	
		if (Noyear%4==0 && Noyear%400==0) {
			System.out.print("The year "+Noyear+" is a Leap Year..");
		}
		else if (Noyear%100==0) {
			System.out.print("The year "+Noyear+" is a Century");
		}else {
			System.out.println("The year "+Noyear+" is not a leap Year..");
		}
}
}