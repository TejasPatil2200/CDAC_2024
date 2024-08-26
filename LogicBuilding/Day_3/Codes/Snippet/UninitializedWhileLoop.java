public class UninitializedWhileLoop {
 public static void main(String[] args) {
 int count = 0;
 while (count < 10) {
 System.out.println(count);
 count++;
 }
 }
}

/*
UninitializedWhileLoop.java:4: error: variable count might not have been initialized
 while (count < 10) {
        ^
1 error


Ans: The value for count variable is not initialized which is why the error occured, setting
the count value to 0 will solve the error.

*/