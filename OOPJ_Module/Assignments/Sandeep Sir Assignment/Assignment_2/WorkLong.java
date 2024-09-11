// Question 5.b

/*
class ValLon {
	public static void main (String [] args){
		long val = Long.BYTES;
	System.out.println("The value of Bytes used to represent the long are :"+val);
}
}

*/

// Question 5.c

/*
class Lonminmax {
	public static void main (String [] args){
		long val = Long.MIN_VALUE;
		long val1 = Long.MAX_VALUE;
	System.out.println("The value of Min size of Long is :"+val);
	System.out.println("The value of Max size of Long is :"+val1);
}
}

*/

// Question 5.d

/*
class LntoStr {
	public static void main (String [] args){
		long number = 922337;
		String newval = Long.toString(number);
	System.out.println("The value of long converted to string is :"+newval);
}
}
*/

// Question 5.e

/*
class Stopaln {
	public static void main (String [] args){
		String strNumber = "92233720368547";
		Long.parseLong(strNumber);
	System.out.println("The value of String parsed to long is :"+strNumber);
}
}
*/

// Question 5.f (Cant convert string with characters into long value)

/*
class Parerrlon {
	public static void main (String [] args){
		String strNumber = "Ab12cd3";
		Long.parseLong(strNumber);
	System.out.println("The value of String parsed to long is :"+strNumber);

}
}
*/

// Question 5.g

/*
class Lntowrap {
	public static void main (String [] args){
		long number = 56793458;
		Long.valueOf(number);
	System.out.println("The value of Long converted to corresponding wrapper class is :"+number);

}
}
*/

//Question 5.h

/*
class Stolon {
	public static void main (String [] args){
		String strNumber = "1920055673";
		Long.valueOf(strNumber);
	System.out.println("The value of String converted to Wrapper long is :"+strNumber);
}
}

*/

//Question 5.i

/*
class Lonsum {
	public static void main (String [] args){
		long a = 1123;
		long b = 9845;
	long sumup = Long.sum(a, b);
	System.out.println("The sum of two long is :"+sumup);
}
}

*/

//Question 5.j

/*
class Lofiminmax {
	public static void main (String [] args){
		long a = 1122;
		long b = 5566;
		long valmin = Long.min(a, b);
		long valmax = Long.max(a, b);
	System.out.println("The min value is :"+valmin);
	System.out.println("The max value is :"+valmax);
}
}
*/

//Question 5.k

class Lncomboh {
	public static void main (String [] args){
		long a = 7;
		String lnb = Long.toBinaryString (a);
		String lno = Long.toOctalString (a);
		String lnh = Long.toHexString (a);
	System.out.println("The Long to binary value is :"+lnb);
	System.out.println("The Long to octadecimal value is :"+lno);
	System.out.println("The Long to Hexadecimal value is :"+lnh);
}
}
