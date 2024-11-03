package week3.day1;

public class AssignmentRemoveDuplicateWordsInaString {

	public static void main(String[] args) {
		//input = "We learn Java basics as part of java sessions in java week1"
		//Expected output: “We learn Java basics as part of sessions in week1”
	   //initializing
		String text = "We learn Java basics as part of java sessions in java week1";
		int count = 0;
		String Output = " ";
		//separate the words in the given string
		String[] words = text.split(" ");
	     int length = words.length;
	    //Use a Nested Loop to Find Duplicates
		for (int i = 0; i <length; i++) {
			for (int j = i+1; j <length; j++) {
				if (words[i].equalsIgnoreCase(words[j])){
				count =count+1;
				// Replace duplicate word with an empty string
				words[j] = " ";
						
			}
			}
	}
if (count>1) {
	for(int i = 0; i<length ;i++) {
		Output = Output + words[i]+" ";
}
	System.out.println(" Expected output after removing duplicaes : " + Output);
}
}
}