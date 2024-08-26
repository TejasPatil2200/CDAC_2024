class Prepost{
	public static void main (String[] args){
		int a = 5, b = 10;
		System.out.println("The Initial values of A & B are :"+a+" "+b);
		int result = ++a + b-- + --b + ++a + --b;
		
		System.out.println("The values of A & B are :"+a+" "+b);
	}
}