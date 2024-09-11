import java.util.Scanner;

class Aritoper{
	public static void main(String[] args) {

	if (args.length !=3){
		System.out.println("Enter the First Integer number : ");
		System.out.println("Enter the Second Integer number : ");
		System.out.println("Enter the operation Symbol to perform operation : ");
		}

		int num1 = Integer.parseInt(args [0]);
		int num2 = Integer.parseInt(args [1]);
		String op = (args [2]);

	switch (op) {
	case "+":
	int add = (num1+num2);
	System.out.println("The Addition of numbers is : "+add);
	break;
	case "-":
	int sub = (num1-num2);
	System.out.println("The Subtraction of numbers is : "+sub);
	break;
	case "*":
	int mul = (num1*num2);
	System.out.println("The Multiplication of numbers is : "+mul);
	break;
	case "/":
	int div = (num1/num2);
	System.out.println("The Division of numbers is : "+div);
	break;
	}
}
}