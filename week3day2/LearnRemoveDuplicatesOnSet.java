package week3day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnRemoveDuplicatesOnSet {

	public static void main(String[] args) {
		//print unique values in the given array
		//Declare an array
		int num [] = { 2,4,5,5,7,2,3,4,7};
		//declare an empty set
		//syntax : interface<wrapperclass> variable name = new implementation clasess <wrapperclass>();
		//implementation classes varies on set: treeset, linkedhash set and hashset
		//Tree set implementation
		Set <Integer> unique = new TreeSet <Integer> ();// import to java util
		//for loop iteration
		for (int i = 0; i < num.length; i++) {
			//adding set values on iteration using add method
			boolean add = unique.add(num[i]); //it will add values inside the set
		}
		System.out.println(unique);// it will start iterate one by one if it is true it will print
		//Hash set implementation
				Set <Integer> unique1 = new HashSet <Integer> ();// import to java util
				//for loop iteration
				for (int i = 0; i < num.length; i++) {
					//adding set values on iteration using add method
					boolean add = unique1.add(num[i]); //it will add values inside the set
				}
				System.out.println(unique1);// it will start iterate one by one if it is true it will print
				//LinkedHash set implementation
						Set <Integer> unique2 = new LinkedHashSet <Integer> ();// import to java util
						//for loop iteration
						for (int i = 0; i < num.length; i++) {
							//adding set values on iteration using add method
							boolean add = unique2.add(num[i]); //it will add values inside the set
						}
						System.out.println(unique2);// it will start iterate one by one if it is true it will print
						
             
	}

}
					