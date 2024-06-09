package Recursion;

public class fibonacci {
	
	public static int fib(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		int fnm1=fib(n-1);
		int fnm2=fib(n-2);
		int fnm=fnm1+fnm2;
		return fnm;
	}

	public static void main(String[] args) {
		int n=5;
		
		System.out.print(fib(n));
		
		

	}

}
