package org.shweassignment4;

public class WideningConversionAdvanced {
	public static void main (String [] args) {
		int number = 39;
		System.out.println("The Value Of Number before Performing Conversion Opearations : "+number);
		
		double doubleresult = number;
		float floatresult = (float) number;
		boolean booleanresult = (number !=0); // if boolean is not 0 then it returns FALSE else if 0 then it Returns TRUE..
		System.out.println("");
		System.out.println("The Value Of Number After Performing Double Opeartion is : "+doubleresult);
		System.out.println("The Value Of Number After Performing Float Opeartion is : "+floatresult);
		System.out.print("The Value Of Number After Performing Boolean Opeartion is : "+booleanresult);
	}
}
