public class Factorial {
public static int factorial1(int a) {
int res = 1;
if(a==0 || a==1)
return res;
while(a>1) {
res=res*a;
a--;
}
return res;
}
public static int factorial(int a) { //
if(a==0 || a==1)
return 1;
return a=a*factorial(a-1); //recursion
}
public static void main(String[] args) {
int b=4;
System.out.println(factorial(b));
System.out.println(factorial1(b));
}
}
