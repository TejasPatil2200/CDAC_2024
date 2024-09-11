package pkg1;

import java.util.Scanner;

public class Shape {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Select the Shape you want to calculate Dimensions for :");
	System.out.println("Enter 1 to calculate dimensions of Circle");
	System.out.println("Enter 2 to calculate dimensions of Square");
	System.out.println("Enter 3 to calculate dimensions of Rectangle");
	System.out.println("Enter 4 to calculate dimensions of Triangle");
	int dim = scan.nextInt();
	
	switch(dim) {
	case 1:
		System.out.println("Enter Radius to find dimension of Circle :");
		int radius = scan.nextInt();
		float ac = (float) (3.14 * (radius*radius));
		System.out.println("The Dimensions of circle are : "+ac);
		break;
	case 2:
		System.out.println("Enter side to find dimension of Square :");
		int side = scan.nextInt();
		int as = (side*side);
		System.out.println("The Dimensions of Square are : "+as);
		break;
	case 3:
		System.out.println("Enter Length & breatdh to find dimension of Rectangle :");
		int length = scan.nextInt();
		int breatdh = scan.nextInt();
		int ar = (length*breatdh);
		System.out.println("The Dimensions of Rectangle are : "+ar);
		break;
	case 4:
		System.out.println("Enter Base & Height to find dimension of Triangle :");
		int base = scan.nextInt();
		int height = scan.nextInt();
		float at = (float) (0.5 * (base*height));
		System.out.println("The Dimensions of circle are : "+at);
		break;
	}
	}

}