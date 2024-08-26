public class IncorrectLoopUpdate {
 public static void main(String[] args) {
 int i = 0;
 while (i < 5) {
 System.out.println(i);
 i += 2; // Error: This may cause unexpected results in output
 }
 }
} 

/*
Ans: The output is 
0
2
4
as the increment is set to i+=2 which will increment the value of i by +2 till i<5

*/