//Last LetterCount in Java
public class LastLetterCount {
	public static void main(String[] args) {
		String str =" He's new to bay areas ";
		StringBuilder result = new StringBuilder();
		int scount = 0 ,ycount = 0;
		int index_s =- 1 ,index_y = -1 ;
		
		//Checking if string is not empty 
		if (str == null || str.length() == 0)
			System.out.println("None");
		
		//Removing extra spaces and converting string to array of String
		String arrofstr[] = str.trim().split("\\s+");
		for (int a=0 ;a < arrofstr.length ; a++) {
			System.out.println(arrofstr[a]);	
		}
		
		//Verification if last character is s or y and incrementing count
		for (int i = 0; i < arrofstr.length ; i++) {
			if (arrofstr[i].charAt(arrofstr[i].length() - 1) == 's') {
				scount++;
				if (scount == 1) {
					index_s = i;
				}	
			}
			else if (arrofstr[i].charAt(arrofstr[i].length() - 1) == 'y') {
				ycount++;
				if (ycount == 1) {
					index_y = i;
				}
			}
		}
		System.out.println("No of 's' in string are: " + scount);
		System.out.println("No of 'y' in string are: " + ycount);
			
		//Swapping the words that occured first with s and y at ending
			if(index_s != -1 && index_y != -1){
	            String temp = arrofstr[index_s];
	            arrofstr[index_s] = arrofstr[index_y];
	            arrofstr[index_y] = temp;

		}
		
		// Joining back the words into a string
		for (int x = 0; x < arrofstr.length ; x++) {
			result.append(arrofstr[x]);
			if (x != arrofstr.length-1) {
				result.append(' ');
			}
	}	
	System.out.println(result);	
}
}