public class Switch {
 public static void main(String[] args) {
 int score = 85;
 switch(score) {
 case 100:
 System.out.println("Perfect score!");
 break;
 case 85:
 System.out.println("Great job!");
 break;
 default:
 System.out.println("Keep trying!");
 }
 }
}

/*

Switch.java:4: error: patterns in switch statements are a preview feature and are disabled by default.
 switch(score) {
       ^
  (use --enable-preview to enable patterns in switch statements)
Switch.java:5: error: constant label of type int is not compatible with switch selector type double
 case 100:
      ^
Switch.java:8: error: constant label of type int is not compatible with switch selector type double
 case 85:
      ^
3 errors

Ans: As Float and double datatype is not allowed to be used in switch case, Hence changing the datatype of score to int will solve the error.

*/