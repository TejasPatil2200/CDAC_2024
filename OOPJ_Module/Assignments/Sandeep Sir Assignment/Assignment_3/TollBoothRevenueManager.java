package org.example;

import java.util.Scanner;

public class TollBoothRevenueManager {
	float carRate, truckRate, motorcycleRate;
	int carPass,truckPass,motorcyclePass;
	
	public void setTollRate(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Set Toll Rate For Cars : ");
		carRate = scan.nextFloat();
		System.out.print("Set Toll Rate For Truck : ");
		truckRate = scan.nextFloat();
		System.out.print("Set Toll Rate For Motorcycle : ");
		motorcycleRate = scan.nextFloat();
		//scan.close();
		
	}
	
	public void acceptRecord() {
		Scanner scan = new Scanner(System.in);
	     System.out.print("Enter number of Cars: ");
	     carPass = scan.nextInt();
	     System.out.print("Enter number of Trucks: ");
	     truckPass = scan.nextInt();
	     System.out.print("Enter number of Motorcycles: ");
	     motorcyclePass = scan.nextInt();
	     scan.close();
	}
	
	public float calculateRevenue() {
		return ((carRate * carPass) + (truckRate * truckPass) + (motorcycleRate * motorcyclePass));
	}
	
	public void printRecord() {
		float totalRevenue = calculateRevenue();
		int totalVehicles = (carPass + truckPass + motorcyclePass);
		System.out.println("The Total Number Of Vehicles are : "+totalVehicles);
		System.out.println("The Total Revenue Collected is : "+totalRevenue);
	}

	public static void main (String [] args) {
		TollBoothRevenueManager tbrm = new TollBoothRevenueManager();
		tbrm.setTollRate();
		tbrm.acceptRecord();
		tbrm.printRecord();
	}
}
