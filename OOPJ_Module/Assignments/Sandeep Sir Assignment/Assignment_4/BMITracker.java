package org.example.assignment4;

import java.util.Scanner;

public class BMITracker {
	
	float weight, height;
	
	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public void acceptRecord () {
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter Your Weight in Kilograms : ");
		setWeight(scan.nextFloat());
		System.out.print("Enter Your Height in Meters : ");
		setHeight(scan.nextFloat());
		scan.close();
	}
	
	public float calculateBMI() {
		return getWeight( )/ (getHeight() * getHeight());
	}
	
	public String classifyBMI () {
		float BMI = getWeight()/ (getHeight() * getHeight());
		 if (BMI < 18.5) return "Underweight";
	     else if (BMI < 24.9) return "Normal weight";
	     else if (BMI < 29.9) return "Overweight";
	     else return "Obese";
	}
	
    public void printRecord() {
        float BMI = calculateBMI();
        String classification = classifyBMI();
        System.out.printf("BMI: "+BMI);
        System.out.println("Classification: " + classification);
    }
	

	public static void main (String [] args) {
		 BMITracker tracker = new BMITracker();
	        tracker.acceptRecord();
	        tracker.printRecord();
	    }
}
