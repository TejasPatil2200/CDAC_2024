package pkg1;

import java.util.Scanner;

public class BmiCal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the Weight in KG's");
		int weight = scan.nextInt();
		System.out.println("Enter the Height in Meter's");
		float height = scan.nextFloat();
		
		float BMI = (weight) / (height*height); 
		
		if (BMI < 18.5) {
			System.out.print("Your BMI is "+BMI+" your are in underweight category !! ");
		}else if (BMI <= 25) {
			System.out.print("Your BMI is "+BMI+" your are in Normal category ");
		}else if (BMI <= 30) {
			System.out.print("Your BMI is "+BMI+" your are in Overweight category !! ");
		}else {
			System.out.print("Your BMI is "+BMI+" your are in Obese category !! ");
		}
	}

}
