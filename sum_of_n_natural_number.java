package Recursion;

public class sum_of_n_natural_number {
	
	public static int calSum(int n) {
		if(n==1) {
			return 1;
		}
		int sum=calSum(n-1);
		int sn=n+sum;
		return sn;
	}

	public static void main(String[] args) {
		System.out.print(calSum(184));
		

	}

}
