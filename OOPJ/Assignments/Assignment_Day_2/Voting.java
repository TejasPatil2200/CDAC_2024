package pkg1;

import java.util.Scanner;

public class Voting {
	public static void main (String[] args) {
	Scanner scan = new Scanner (System.in);
	
	System.out.print("Enter the age to check voting eligibility: ");
	int age = scan.nextInt();
		
		if(age>=18) {
			System.out.println("Age is : "+age+" you are eligible for voting..");
		}
		else {
			System.out.println("Age is : "+age+" you are not eligible for voting..");
		}
	}
}
