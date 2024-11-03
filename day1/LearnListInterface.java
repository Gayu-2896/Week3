package week3.day1;

import java.util.ArrayList;
import java.util.List;

public class LearnListInterface {

	public static void main(String[] args) {
		//List Interface - implement cass is Array List
		//Syntax: List <wrapper class> variable name = new implement class <wrapper class>();
		//List <String> mentors = new ArrayList <String>();
		//Step 1: Declare an empty list
		
		List <String> mentors = new ArrayList <String>();// import list and Arraylist from java.util class
		List <String> Coach = new ArrayList <String>();
		Coach.add("Babumanickam");
		mentors.add("Anburaj"); //Add the items
		mentors.add("Mukesh");
		mentors.add("Muthu");
		mentors.add("Kathir");
		System.out.println(mentors);//index starts from 0 and o/p will be in the form for array; this also called as method overloading(same methods & diff parameters)
		mentors.add(2, "Buvanesh");// want to add any element based on the index is also possible : add index and string element
		System.out.println(mentors);
		Coach.addAll(mentors);
		System.out.println(Coach);
		
		//size of the List
		int size = mentors.size();//size starts from 1
		System.out.println(size);
		
		//Retrieve the particular value from the list using get method
		
		String string = mentors.get(4);//using index value
		System.out.println(string);
		
		//remove the item from the list
		
		String remove = mentors.remove(2);
		System.out.println(remove);//index 2 wil get removed
		
		//clear the items from the list
		mentors.clear();//return type of clear is void
		System.out.println(mentors);
		
		//creating another list list for adding the 1st list(mentors) values using addall method
//		List <String> Coach = new ArrayList <String>();
//		Coach.add("Babumanickam");
//		System.out.println(Coach);
//		Coach.addAll(mentors);
		System.out.println(Coach);//here it will not get added after the mentors sysout only we can able to add then here also it wil get run
	}

}
