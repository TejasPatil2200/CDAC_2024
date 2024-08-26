public class OffByOneErrorForLoop {
 public static void main(String[] args) {
 for (int i = 1; i < 10; i++) {
 System.out.println(i);
 }
 // Expected: 10 iterations with numbers 1 to 10
 // Actual: Prints numbers 1 to 10, but the task expected only 1 to 9
 }
} 

/*
Ans: In the above code the condition is set as i<=10 so the loop will print until the value of i =10 
if we change the condition to i<10, Then we can achive the expected output.

*/