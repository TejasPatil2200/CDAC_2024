package org.example.assignment4;

import java.util.Scanner;

public class TollBoothRevenueManager {
	float carRate, truckRate, motorcycleRate;
	int carPass,truckPass,motorcyclePass;
	
	public float getCarRate() {
		return carRate;
	}

	public void setCarRate(float carRate) {
		this.carRate = carRate;
	}

	public float getTruckRate() {
		return truckRate;
	}

	public void setTruckRate(float truckRate) {
		this.truckRate = truckRate;
	}

	public float getMotorcycleRate() {
		return motorcycleRate;
	}

	public void setMotorcycleRate(float motorcycleRate) {
		this.motorcycleRate = motorcycleRate;
	}

	public int getCarPass() {
		return carPass;
	}

	public void setCarPass(int carPass) {
		this.carPass = carPass;
	}

	public int getTruckPass() {
		return truckPass;
	}

	public void setTruckPass(int truckPass) {
		this.truckPass = truckPass;
	}

	public int getMotorcyclePass() {
		return motorcyclePass;
	}

	public void setMotorcyclePass(int motorcyclePass) {
		this.motorcyclePass = motorcyclePass;
	}

	public void setTollRate(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Set Toll Rate For Cars : ");
		setCarRate(scan.nextFloat());
		System.out.print("Set Toll Rate For Truck : ");
		setTruckRate(scan.nextFloat());
		System.out.print("Set Toll Rate For Motorcycle : ");
		setMotorcycleRate(scan.nextFloat());
		//scan.close();
		
	}
	
	public void acceptRecord() {
		Scanner scan = new Scanner(System.in);
	     System.out.print("Enter number of Cars: ");
	     setCarPass  (scan.nextInt());
	     System.out.print("Enter number of Trucks: ");
	     setTruckPass (scan.nextInt());
	     System.out.print("Enter number of Motorcycles: ");
	     setMotorcyclePass  (scan.nextInt());
	     scan.close();
	}
	
	public float calculateRevenue() {
		return ((getCarRate() * getCarPass()) + (getTruckRate() * getTruckPass()) + (getMotorcycleRate() * getMotorcyclePass()));
	}
	
	public void printRecord() {
		float totalRevenue = calculateRevenue();
		int totalVehicles = (getCarPass() + getTruckPass() + getMotorcyclePass());
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
