package week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AssignmentFindSecondLargestNumberusingList {

	public static void main(String[] args) {

		Integer [] numbers = {3,2,11,4,6,7};
		//Convert the array to a List
		   List <Integer> list = new ArrayList <Integer>(Arrays.asList(numbers));
		  //sort the list 
		   Collections.sort(list);
		   System.out.println(list);
		   int size = list.size();
		   // using get method
		   System.out.println("Second Largest Number is : " + list.get(size-2));
	}

}
