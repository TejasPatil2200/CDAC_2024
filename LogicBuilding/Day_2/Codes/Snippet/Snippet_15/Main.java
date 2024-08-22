public class Main {
 public static void main(String[] args) {
 int num1 = 10;
 double num2 = 5.5;
 double result = num1 + num2;
 System.out.println(result);
 }
} 

/*
Main.java:5: error: incompatible types: possible lossy conversion from double to int
 int result = num1 + num2;
                   ^
1 error

Ans: As one variable has datatype as int and other has double, But the end result value was assigned as int which has less storage capacity then the double. Hence making the result variable's datatype as double
solves the problem.

*/