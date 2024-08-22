public class Main {
 public static void main(String[] args) {
	displayMessage();
}
 static void displayMessage() {
 System.out.println("Message");
 }
 }

/*
Main.java:3: error: illegal start of expression
 static void displayMessage() {
 ^
Main.java:7: error: class, interface, enum, or record expected
}
^
2 errors


Ans: the displaymessage function was not called which was resulting 
in the formation of the error.


*/