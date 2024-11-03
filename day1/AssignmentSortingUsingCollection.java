package week3.day1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AssignmentSortingUsingCollection {

	public static void main(String[] args) {
		String [] A = {"HCL","Wipro","Aspire Systems","CTS"};
		
		//Syntax: List <wrapperclass> variable name = new implementclass <wrapperclass>();
		//Step 1: Declare an empty list
	    List <String> array = new ArrayList <String>();// import list and Arraylist from java.util class
	    List<String> reverse = new ArrayList<String>();// import list and Arraylist from java.util class
	    for (String value : A) {
	    	array.add(value);	
		}
	    
         int size = array.size();
         System.out.println(size);
         Collections.sort(array);
         System.out.println("After sorting: " + array);
         for (int i = size - 1 ; i>=0; i--) {
          String string = array.get(i);
         reverse.add(string);
		}
         
        System.out.println("Reverse order: "+ reverse);
	}

}
