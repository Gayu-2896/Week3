package week3day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class AssignmentOnRemoveDuplicatesOnSet {

	public static void main(String[] args) {
		//print unique values in the given array
	   //Declare an array
		String str = "google";
		//Convert String to charcter using CharArray method
		char[] charArray = str.toCharArray();
		Set<Character> unique = new LinkedHashSet<Character>();//wrapper class of string is String and charcter is charcter
		for (int i = 0; i < charArray.length; i++) {
			boolean b = unique.add(charArray[i]);
		}
		
		System.out.println(unique);	
		Set<Character> unique1 = new HashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			boolean b = unique1.add(charArray[i]);
		}
		
		System.out.println(unique1);	
		Set<Character> unique2 = new TreeSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			boolean b = unique2.add(charArray[i]);
		}
		
		System.out.println(unique);	
	}

}
