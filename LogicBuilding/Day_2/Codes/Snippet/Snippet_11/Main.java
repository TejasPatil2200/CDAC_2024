public class Main {
 public static void main(String[] args) {
 int[] arr = {1, 2, 3};
 System.out.println(arr[2]);
 }
} 

/*
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
        at Main.main(Main.java:4)
*/

Ans: Array starts from 0, So it cannot fetch any value for arr[5].