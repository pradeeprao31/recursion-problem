package Recursion;

public class OptimizedPower {
	
	public static int optimizedpower(int a, int n) {
		if(n==0) {
			return 1;
		}
		
		int halfPowerSq = optimizedpower(a,n/2) * optimizedpower(a,n/2);
		
		if(n%2 !=0) {
			halfPowerSq =halfPowerSq *a;
		}
		
		return halfPowerSq;
	}

	public static void main(String[] args) {
		
		
		
		System.out.print(optimizedpower(2,5));

	}

}
