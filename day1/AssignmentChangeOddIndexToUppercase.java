package week3.day1;

public class AssignmentChangeOddIndexToUppercase {

	public static void main(String[] args) {
		String test = "changeme";
		int length = test.length();
		System.out.println(length);
		
		//using for loop iteration for printing all the values
		for (int i = 0; i < test.length(); i++) {
			//using toCharAt() method for finding index
			char L= test.charAt(i);
			if ((i%2==1)) {
				System.out.println(Character.toUpperCase(L));
			} else {
				System.out.println(Character.toLowerCase(L));
			}
			
		}
		}
}

	


