public class Palindrome {
	static boolean isPalindrome(String str) {
		str = str.toLowerCase();
		str = str.replaceAll("\\s", ""); 
		String reverse = "";
		if (str.length() == 0) // If String is empty
		{
			System.out.println("Empty String");
			return false;
		} 
		else {
			
			// Reverse the String
			for (int j = str.length() - 1; j >= 0; j--) {
				reverse = reverse + str.charAt(j);
			}
			
			// Compare the strings
			int index_str = 0;
			int index_reverse = 0;
			while (index_reverse < reverse.length() && index_str < str.length()) {
				
				// Checks if the value is between a-z and 0-9
				if (str.charAt(index_str) < 48 || 57 < str.charAt(index_str) || str.charAt(index_str) < 97
						|| str.charAt(index_str) > 122) {
					index_str++;}
				
				// Checks if the value is between a-z and 0 -9
				else if (reverse.charAt(index_reverse) < 48 || 57 < reverse.charAt(index_reverse)
						|| reverse.charAt(index_reverse) < 97 || reverse.charAt(index_reverse) > 122) {
					index_reverse++;}
				
				// Checks if the string is palingdrome or not
				else {
					if (str.charAt(index_str) == reverse.charAt(index_reverse)) {
						index_str++;
						index_reverse++;
					} else
						return false;
				}
			}
		return true;
		}
	}

	public static void main(String[] args) {
		String str = "   ";
		if (isPalindrome(str))
			System.out.print("Is a Pallingdrome");
		else
			System.out.print("Not a Palindrome");
	}
}
