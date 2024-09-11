class Pritostr {
	public static void main (String [] args){
		boolean a = true;
		byte b = 30;
		//char c = "A";
		short d = 50;
		int e = 100;
		float f = 20.0f;
		double g = 40.00;
		long h = (long) 60.0;

	String a1 = Boolean.toString(a);
	System.out.println("Boolen to string value is : "+a1);
	String b1 = Byte.toString(b);
	System.out.println("Byte to string value is : "+b1);
	//String c1 = char.toString(c);
	//System.out.println("Char to string value is : "+c1);
	String d1 = Short.toString(d);
	System.out.println("Short to string value is : "+d1);
	String e1 = Integer.toString(e);
	System.out.println("Integer to string value is : "+e1);
	String f1 = Float.toString(f);
	System.out.println("Float to string value is : "+f1);
	String g1 = Double.toString(g);
	System.out.println("Double to string value is : "+g1);
	String h1= Long.toString(h);
	System.out.println("Long to string value is : "+h1);
}
}
	