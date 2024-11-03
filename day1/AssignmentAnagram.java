package week3.day1;

import java.util.Arrays;

public class AssignmentAnagram {

	public static void main(String[] args) {
		//syntax using instantiation
		String word = new String("stops");
		String word1 = new String("posts");
		//find length of the words using length method
		int arrlength = word.length();//store into local variable
		System.out.println(arrlength);
		int arrlength1 = word1.length();//store into local variable
		System.out.println(arrlength1);
		//convert the string to character array using toCharArray() method
		char[] charArray = word.toCharArray();//store into local variable
		System.out.println(charArray);
		char[] charArray2 = word1.toCharArray();//store into local variable
		System.out.println(charArray2);
		//To print all the  chracters in the given string using iteration(for loop method)
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
			
				for (int j = 0; j < charArray2.length; j++) {
				System.out.println(charArray2[j]);
				}
				//sort the array
				Arrays.sort(charArray);
				Arrays.sort(charArray2);
				//comparing two strings using equals() method
		if (Arrays.equals(charArray, charArray2)) {
			System.out.println("it is anagram");
		} else {
			System.out.println("it is not an anagram");
		} 
		
}
}
