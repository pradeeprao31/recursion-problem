package Recursion;
import java.util.*;
public class removeduplicate_from_String {
	
	
	public static void removeduplicate(String str , int idx, StringBuilder newstr , boolean map[]) {
		
		
		if(idx==str.length()) {
			System.out.print(newstr);
			return;
		}
		
		char currChar= str.charAt(idx);
		if(map[currChar-'a'] == true) {
			 removeduplicate(str,idx+1,newstr,map);
		}
		else {
			map[currChar-'a'] = true;
			removeduplicate(str,idx+1,newstr.append(currChar),map);
		}
		
	}

	public static void main(String[] args) {
		
		String str="pradeep";
		removeduplicate(str,0,new StringBuilder(""),new boolean[26]);
		

	}

}
