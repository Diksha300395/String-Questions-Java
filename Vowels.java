// This is a program to identify number of vowels present in a string

public class Vowels {
	public static void main(String[] args) {
		String str = "John has a cat.John took his cat for a walk besides a lake.Cat was happy in park";
		int vcount = 0;
		str = str.toLowerCase();
		for (int index = 0; index < str.length(); index++) {
			//Condition to verify if the string character is a,e,i,o,u
			if (str.charAt(index) == 'a' || str.charAt(index) == 'e' || str.charAt(index) == 'i'
					|| str.charAt(index) == 'o' || str.charAt(index) == 'u') {
				vcount++;
			}
		}
		System.out.println("No of vowels in statement are : " + vcount);
	}
}
