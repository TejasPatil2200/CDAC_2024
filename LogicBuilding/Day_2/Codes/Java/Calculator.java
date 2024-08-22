class Calculator{
		public static void main (String[] args){
			int Ops=4, a=0,b=10;
			switch(Ops){
				case 1:
				System.out.println("Addition of "+a+ " and " +b+ " is = "+(a+b));
				break;
				case 2:
				System.out.println("Subtraction of "+a+ " and " +b+ " is = "+(a-b));
				case 3:
				System.out.println("Multiplication of " +a+ " and " +b+ " is = "+(a*b));
				case 4:
				if (a==0 || b == 0){
				System.out.println("Division is not possible..");}
				else{
				System.out.println("Division of "+a+ " and " +b+ " is = "+(a/b));}
			}
		}
}