package week3.day1;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;

public class AssignmentFindIntersectionusingList {

	public static void main(String[] args) {
		Integer [] a  = {3,2,11,4,6,7}; 
		Integer [] b  = {1,2,8,4,9,7};
		//Convert the array to a List
		   //List <Integer> list = new ArrayList <Integer>(Arrays.asList(a));
		 //Convert the array to a List
		   //List <Integer> list1 = new ArrayList <Integer>(Arrays.asList(b));
		   System.out.println("Intersection value of two lists: ");
		   //sort the list 
            //Collections.sort(list);
		    // System.out.println(list);
		    // Collections.sort(list1);
		    // System.out.println(list1);
		    //size of the list
		   // int size = list.size();
		   //System.out.println(size);
	       //int size2 = list1.size();
		   // System.out.println(size2);
		   for (int i = 0; i < a.length; i++) {
				
				for (int j = 0; j < b.length; j++) {
					
					if(a[i]==b[j]){
					System.out.println(a[i]);
		}
				}
			}
		}

	}