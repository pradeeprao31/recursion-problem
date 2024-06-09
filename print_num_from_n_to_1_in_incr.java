package Recursion;

public class print_num_from_n_to_1_in_incr {
	
	public static void printinc(int n) {
		if(n==1) {
			System.out.print(n +" ");
			return;
		}
		printinc(n-1);
		System.out.print(n+" ");
		
	}

	public static void main(String[] args) {
		printinc(10);
		

	}

}
