package Recursion;

public class firstoccurence {
	
	public static int FirstOccerence(int arr[],int key, int i) {
		if(i==arr.length-1) {
			return -1;
		}
		if(arr[i]==key) {
			return i;
		}
	return	FirstOccerence(arr,key,i+1);
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,6,4,7,9,4,6,9,4,8,5};
		
		System.out.print(FirstOccerence(arr,9,0));

	}

}
