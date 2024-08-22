class DisCalc{
		public static void main (String[] args){
			int PA=900;
			float Dis20 = (20.0f / 100) * PA;
			float Dis10 = (10.0f / 100) * PA;
			float Dis5 = (5.0f / 100) * PA;
			float FA;
			if(PA>=1000){
			FA=PA-Dis20;
			System.out.println("You made a shopping of amount " +PA+ " you have 20% discount = " +Dis20+ " and the final amount is: " +FA);}
			else if ( PA >500 || PA ==999 ){
			FA=PA-Dis10;
			System.out.println("You made a shopping of amount " +PA+ " you have 10% discount = " + Dis10+ " and the final amount is: " +FA);}
			else{
			FA=PA-Dis5;
				System.out.println("You made a shopping of amount " +PA+ " you have 5% discount = " + Dis5+ " and the final amount is: " +FA);}
		}
}