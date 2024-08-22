public class Main {
 public static void main(String[] args) {
 int a = 10;
 int b = 0;
 int result = a / b;
 System.out.println(result);
 }
}

/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Main.main(Main.java:5)

Ans: whatever we may answer, we will then have to agree that that answer times 0 equals to 1, and that cannot be ​true, because anything times 0 is 0
*/