public class MisplacedForLoopBody {
 public static void main(String[] args) {
 for (int i = 0; i < 5; i++){
 System.out.println(i);{
 System.out.println("Done");}}
 }
} 

/*
Ans: Opending the { bracket after the SOP of i will make the done text to be print after
every iteration of the loop.
/*