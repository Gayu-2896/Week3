package week3.day1;

public class LearnStringMethodsContinuation {

	public static void main(String[] args) {
		//Replaceall method
		String Str = "Testleaf123";
		String replaceAll = Str.replaceAll("[^0-9]", "");//Converting to local variable; "" - denotes empty space and Testleaf replace by emptyspace
		System.out.println(replaceAll);
		String replaceAll1 = Str.replaceAll("[^0-9]", "t");
		System.out.println(replaceAll1);
		String replaceAll2 = Str.replaceAll("[^A-z]", "");//Make sure it should not be case sensitive
		System.out.println(replaceAll2);
		//Replace Method
		String replaceAll3 = Str.replaceAll("l", "2");
		System.out.println(replaceAll3);
		
	    //String to Integer
		String s = "321";//String s = abc321 - means it will thorw numberformat exception error ethier it should be fully string or number
		int int1 = Integer.parseInt(s);
		System.out.println(int1);//Data type changed from string to integer
		System.out.println(int1 +10);
		// Integer to String
		int Num = 32;
		System.out.println(Num+10);
		String str = Integer.toString(Num);
		System.out.println(str + 10); //converted the data type from int to string and it is concatenating(32+10 =3210)
		
		//Split Method
		String ss = "Testleaf and Qeagle";
		String[] split = ss.split("e");
		System.out.println(split[1]);//based on given index value only it will split
		String[] split1 = ss.split("e");
		System.out.println(split1[3]);//if index num exceeds the given length then it will show ArrayIndex out of bound exceotion error
		//to print all the e in the given string then need to iterate
		for (int i = 0; i < split1.length; i++) {
			System.out.println(split[i]);
		}
		String[] split2 = ss.split("Test");
		System.out.println(split2[1]);
		String[] split3 = ss.split(" ");
		System.out.println(split3[2]);
		
		//SubString Method
		String substring = ss.substring(4);//begin index -include the first given index letter
		System.out.println(substring);
		String substring2 = ss.substring(5, 13);
		System.out.println(substring2);//end index -exclude the last index letter
	}

}
