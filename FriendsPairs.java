package Recursion;

public class FriendsPairs {
	
	public static int friendsPairs(int n) {
		if(n==1 || n==2) {
			return n;
		}
		
		//Single 
		int fnm1=friendsPairs(n-1);
		
		//pair
		int fnm2=friendsPairs(n-2);
		int pairWay=(n-1)*fnm2;
		
		// total way
		int totalWay=fnm1+pairWay;
		
		return totalWay;
		
		
	}

	public static void main(String[] args) {
		
		
		System.out.print(friendsPairs(3));
		

	}

}
