public class Main {
 public static void main(String[] args) {
 String str = "null";
 System.out.println(str.length());
 }
} 

/*

Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null
        at Main.main(Main.java:4)

*/

Ans: Here the str value was assigned as null (Nothing), and length 
function was used to calculate the number of characters in the string 
which resulted in throwing Nullpointerexception error.