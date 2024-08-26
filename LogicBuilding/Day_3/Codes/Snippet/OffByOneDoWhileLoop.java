public class OffByOneDoWhileLoop {
 public static void main(String[] args) {
 int num = 1;
 do {
 System.out.println(num);
 ++num;
 } while (num <= 5);
 }
}

/*
Ans: if we want to print positive numbers we need to set the num to increment as -- will decrement
the vale and will cause it to fo the negative side, and to print numbers till 5 we'll need
to update the while condition to num <= 6.

*/