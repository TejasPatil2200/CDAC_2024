public class Switch {
 public static void main(String[] args) {
 int number = 5;
 switch(number) {
 case 5:
 System.out.println("Number is 5");
 break;
 case 6:
 System.out.println("This is another case 5");
 break;
 default:
 System.out.println("This is the default case");
 }
 }
}

/*
Switch.java:8: error: duplicate case label
 case 5:
 ^
1 error


Ans:  if two cases in a switch statement have the same label, the second case will never be executed, The way duplicate values are not allowed here in switch case no duplicate labels are allowed.
*/