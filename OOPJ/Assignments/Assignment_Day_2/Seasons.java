package pkg1;

import java.util.Scanner;

public class Seasons {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the month number from 1-12 to check corresponding season :");
	int month = scan.nextInt();
	
	switch(month) {
	case 12:
	case 1:
	case 2:
		System.out.println("Its winter season!!");
		break;
	case 3:
	case 4:
	case 5:
		System.out.println("Its Spring season!!");
		break;
	case 6:
	case 7:
	case 8:
			System.out.println("Its Summer season!!");
			break;
	case 9:
	case 10:
	case 11:
		System.out.println("Its Autumn season!!");
			break;
		
	}
	}

}
