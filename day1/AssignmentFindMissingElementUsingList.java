package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AssignmentFindMissingElementUsingList {

	public static void main(String[] args) {
//		find the missing element in the given array
		int [] missingNumber = {1,2,3,4,10,6,8};
//		Convert the array to a List
	   List <Integer> list = new ArrayList <Integer>();
	   for (int num : missingNumber) {
		   list.add(num);
	}
	   
	   Collections.sort(list);
	   System.out.println(list);
	  
	
for (int i = 0; i < list.size() -1; i++) {
	int currentNumber = list.get(i);
    int nextNumber = list.get(i + 1);
    if (currentNumber + 1 != nextNumber) {
		for (int j =currentNumber + 1; j < nextNumber; j++) {
			
			System.out.println("missing number is " + j);
		}
	

    }
}
	}
}

	
	
	
	

