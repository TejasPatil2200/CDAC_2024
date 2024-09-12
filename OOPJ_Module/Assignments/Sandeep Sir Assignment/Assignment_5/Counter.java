package org.sdassignment5;

class InstanceCounter {
	private static int count = 0;
	
	public InstanceCounter() {
		count++;
	}
	
	public static int getCount() {
		return count;
	}
}


public class Counter {
	public static void main(String[] args) {
		new InstanceCounter();
		new InstanceCounter();
		new InstanceCounter();
		new InstanceCounter();
		new InstanceCounter();

		System.out.println("Total number of instance created are : "+InstanceCounter.getCount());
}
}
