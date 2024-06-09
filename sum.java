package Recursion;
import java.util.*;
public class sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :-");
        int num=sc.nextInt();
        int choice ;
        int evensum=0;
        int oddsum=0;
        while(num<0) {
        	
       
        if(num%2==0) {
        	evensum+=num;
        }
         {
        	oddsum+=num;
        }
         System.out.print(evensum);
         System.out.print(oddsum);
	}
	 }

}
