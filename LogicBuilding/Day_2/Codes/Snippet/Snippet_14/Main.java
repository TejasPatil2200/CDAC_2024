public class Main {
 public static void main(String[] args) {
 String num = "Hello";
 System.out.println(num);
 }
} 

/*
Main.java:3: error: incompatible types: String cannot be converted to double
 double num = "Hello";
              ^
1 error

*/

Ans: Double data type was assigned to num variable which was holding 
string value, Hence it displayed the error as string cannot be converted to double.