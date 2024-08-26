class Fprime {
	public static void main (String[] args){
	int count = 0;
	int number = 2;
	System.out.println("First 5 prime numbers are : ");
	
	while (count < 5) {
		boolean isprime = true;
		
		for(int i = 2; i<number; i++){
		if (number % i == 0){
			isprime = false;
			break;
			}
		}
		
		if (isprime) {
		System.out.println(number);
		count++;}
		number++;}
		}
		}
		
		