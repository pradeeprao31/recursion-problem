package Recursion;

public class Binary_String_problem {
	
	
	
	public static void PrintBinStrin(int n, int lastplace, String str) {
		if(n==0) {
			System.out.println(str);
			return;
		}
		
		PrintBinStrin(n-1,0,str+"0");
		
		if(lastplace==0) {
			PrintBinStrin(n-1,1,str+"1");
		}
	}

	public static void main(String[] args) {
		
		PrintBinStrin(3,0,"");
		
		
	}

}
