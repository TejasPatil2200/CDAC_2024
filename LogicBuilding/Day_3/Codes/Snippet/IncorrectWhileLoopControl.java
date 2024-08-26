public class IncorrectWhileLoopControl {
 public static void main(String[] args) {
 int num = 10;
 while (num == 10) {
	 --num;
 System.out.println(num);
 
 }
 }
}

/*
IncorrectWhileLoopControl.java:4: error: incompatible types: int cannot be converted to boolean
 while (num = 10) {
            ^
1 error

Ans: In the while loop condition area we have to make a decision which is either true or false
we can't define num=10 instead we have to use num==10 to solve the error. 

*/