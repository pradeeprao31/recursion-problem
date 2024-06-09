package Recursion;

public class lsatoccurance {
	public static int LastOccurance(int arr[], int key, int i ) {
		if(i==arr.length) {
			return -1;
		}
		
		int isFound=LastOccurance(arr, key , i+1);
		if(isFound == -1 && arr[i]==key) {
			return i;
		}
		
		 return isFound;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,6,4,7,9,4,6,9,4,8,5};
		System.out.print(LastOccurance(arr,9,0));
		
		
		
	}

}
