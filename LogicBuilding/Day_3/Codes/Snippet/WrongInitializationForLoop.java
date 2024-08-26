public class WrongInitializationForLoop {
 public static void main(String[] args) {
 for (int i = 0; i<= 10; i++) {
 System.out.println(i);
 }
 }
} 

/*
Ans: In the above code the initial value for i is 10  and 10>=0 will cause the code to 
go in infinite loop if we set the initial value of i=0 and i<=10 then we can get proper output.


*/