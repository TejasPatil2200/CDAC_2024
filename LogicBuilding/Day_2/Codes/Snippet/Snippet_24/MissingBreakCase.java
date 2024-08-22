public class MissingBreakCase {
 public static void main(String[] args) {
 int level = 1;
 switch(level) {
 case 1:
 System.out.println("Level 1");
 break;
 case 2:
 System.out.println("Level 2");
 case 3:
 System.out.println("Level 3");
 default:
 System.out.println("Unknown level");
 }
 }
} 

/*
Ans: As in the above code the initial value for level is set to 1 so it will start the switch case execution from case 1 and as their is no break; statment present between any cases it will execute all the cased till the end is found for the switch case, But if we put break; statment after the case 1 or 2 or 3 it will end its execution of checking the cases and not proceed further.

*/