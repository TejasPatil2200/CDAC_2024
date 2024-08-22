public class Main {
 public static void main(String[] args) {
 int a = 10;
 int b = 5;
 int result = a * b;
 System.out.println(result);
 }
} 

/*
Main.java:5: error: illegal start of expression
 int result = a ** b;
                 ^
1 error

Ans: In java the ** operation is not predefined hence it is not a 
valid recognition operation in the above code, changing it to single
* the multiply operation will solve the error.
*/
