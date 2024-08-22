public class Main {
 public static void display() {
 System.out.println("No parameters");
 }
 public static void display(int num) {
 System.out.println("With parameter: " + num);
 }
 public static void main(String[] args) {
 display();
 display(5);
 }
} 

/*
Main.java:9: error: non-static method display() cannot be referenced from a static context
 display();
 ^
Main.java:10: error: non-static method display(int) cannot be referenced from a static context
 display(5);
 ^
2 errors

*/