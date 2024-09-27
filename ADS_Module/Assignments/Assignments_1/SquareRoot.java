import java.lang.Math; 
import java.util.Scanner;
class SquareRoot { 

    public static void main(String args[]) 
    { 
        Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number To Find SquareRoot of: ");
		int num = scan.nextInt(); 
        System.out.println(Math.round(Math.sqrt(num))); 
		
 
    } 
} 
