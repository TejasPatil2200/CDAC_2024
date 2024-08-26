public class LoopVariableScope {
 public static void main(String[] args) {
 for (int i = 0; i < 5; i++) {
 int x = i * 2;
 System.out.println(x); // Error: 'x' is not accessible here
 }}
} 

/*

Ans: As the print statement is written outside the for loop the error is occuring if we 
set the SOP statement inside the for loop the error is solved.




*/