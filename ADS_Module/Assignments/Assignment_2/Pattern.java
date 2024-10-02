import java.util.Scanner;
class Pattern{
	public static void main (String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Row u want to print pattern for:");
		int num = scan.nextInt();
		for (int i=1;i<=num;i++){
			System.out.println("");
			for (int j=0;j<i;j++){
		System.out.print("*");}}
	}
}