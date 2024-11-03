package week3.day1;

public class AssignmentReverseOddWordsIntoString {

	public static void main(String[] args) {
		String test = "I am a software tester";
		//Expected output: "I ma a erawtfos tester";
		//Create an empty string to store the output
		String[] words = test.split(" ");
		   int length = words.length;
		String output="";
		
		
         for (int i = 0; i <length; i++) {
        	 if (i%2!=0) {
        		 char[] charArray = words[i].toCharArray();
        		 String reversedWord = ""; 
        		 for (int j = charArray.length-1; j >=0; j--) {
        			 reversedWord += charArray[j];
				}
        
        		 output += reversedWord + " ";
        	 }
         
        	 else {
        		 output += words[i] + " ";
        	 }
			}
        		
         System.out.println(" Expected output after Reversing the OddWords into String : " + output);
	}
}

