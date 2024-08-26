class IncorrectWhileCondition {
 public static void main(String[] args) {
 int count = 0;
 while (count == 0) {
 System.out.println(count);
 count--;
 }
 }
} 

/*
Snippet2.java:1: error: class IncorrectWhileCondition is public, should be declared in a file named IncorrectWhileCondition.java
public class IncorrectWhileCondition {
       ^
Snippet2.java:4: error: incompatible types: int cannot be converted to boolean
 while (count = 0) {
              ^
2 errors

Ans: In while loop count is set to = 0, instead if we set it to count ==0 is resolve the issue. As while block execute when the condition is true

*/