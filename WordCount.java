public class WordCount {
	static int wordcount(String string) {
		int count = 1;
		for(int i = 0;i < string.length();i++) {
			if (string.charAt(i) == ' ' &&  i < string.length()-1 && string.charAt(i+1) !=' ' ) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String string = "I am trying to find out number of words in this string ";
		System.out.println(wordcount(string) + " words");
	}
}