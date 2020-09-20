public class Consonants {
	public static void main(String[] args) {
		String str="John has a cat and he took it to park";
		int ccount = 0;
		String result="";
		str= str.toLowerCase();
		for (int index=0; index < str.length(); index++)
		{//Here it checks if the character At index is not a,e,i,o,u and the character is between a-z
			if (str.charAt(index)> 97 && str.charAt(index)<122 && str.charAt(index) != 'a' && str.charAt(index) != 'e' && str.charAt(index) != 'i' && str.charAt(index) != 'o' && str.charAt(index) != 'u' )
			{
				ccount++;
				result = result + "*";
			}
			else
				result = result + str.charAt(index);
		}
     	System.out.println("No of vowels in statement where:" + ccount);
		System.out.println(result);
	}
}
