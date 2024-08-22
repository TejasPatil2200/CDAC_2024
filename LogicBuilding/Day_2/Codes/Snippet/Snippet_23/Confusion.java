public class Confusion {
 public static void main(String[] args) {
 int value = 2;
 switch(value) {
 case 1:
 System.out.println("Value is 1");
 case 2:
 System.out.println("Value is 2");
 case 3:
 System.out.println("Value is 3");
 break;
 default:
 System.out.println("Default case");
 }
 }
} 

/*
Ans: As the int value is asssigned as 2 the execution of cases will start from case 2 and forward and if we don't want to print the default case after the value 2 & 3 we can add the break; condition to stop the switch case after the case 3 execution.

*/