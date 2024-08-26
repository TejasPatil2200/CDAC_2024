class Fibonacci{
	public static void main (String[] args){
		int a = 0, b = 1;
		System.out.println("Fibonacci series upto 21 is : ");
		while (a <= 21) {
			System.out.print(a + " ");
			int next = a+b;
			a=b;
			b=next;
		}
		
	}
}