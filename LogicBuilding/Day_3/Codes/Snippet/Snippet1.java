class InfiniteForLoop {
 public static void main(String[] args) {
 for (int i = 0; i < 10; i++) {
 System.out.println(i);
 }
 }
} 

/*
Snippet1.java:1: error: class InfiniteForLoop is public, should be declared in a file named InfiniteForLoop.java
public class InfiniteForLoop {
       ^
1 error

Ans: class name should not be public and the for loop condition is running in flse state as the condition i<10 is not meet because of i--if we set i++
*/