// Question 2.b

/*
class Testval {
	public static void main (String [] args){
		Byte ty = Byte.BYTES;
	System.out.println("Value using BYTES Field :"+ty);
}
}

*/

//Question 2.c

/*
class Bminmax {
	public static void main (String [] args){
		Byte Min = Byte.MIN_VALUE;
		Byte Max = Byte.MAX_VALUE;
	System.out.println("Byte Min value is : "+Min);
	System.out.println("Byte Max value is : "+Max);
}
}

*/

//Question 2.d

/*
class BytoSt {
	public static void main (String [] args){
		Byte number = 39;
		String val = Byte.toString (number);
	System.out.println("Byte to String value is : "+val);
}
}

*/

//Question 2.e

/*
class SttoBy {
	public static void main (String [] args){
		String strNumber = "100";
		Byte.parseByte(strNumber);
	System.out.println("The String to Byte converted code is : "+strNumber);
}
}

*/

//Question 2.f (string cannot be parsed into the byte)

/*
class NumErr {
	public static void main (String [] args){
		String strNumber = "Ab12cd3";
		Byte.parseByte(strNumber);
	System.out.println("The String to Byte conversion is : "+strNumber);
}
}
*/

//Question 2.g

/*
class Wraby {
	public static void main (String [] args) {
		Byte number = 50;
		Byte.valueOf (number);
	System.out.println("Byte converted into wrapper class: "+number);
}
}

*/

//Question 2.h

/*
class Wrast {
	public static void main (String [] args){
		String strNumber = "653";
		String.valueOf(strNumber);
	System.out.println("String converted to wrapper class: "+strNumber);
}
}

*/

//Question 2.i 

class Playay{
	public static void main (String [] args){
		Byte value = 45;
		String newval = Byte.toString(value);
	System.out.println("Byte converted to String : "+newval);
}
}
