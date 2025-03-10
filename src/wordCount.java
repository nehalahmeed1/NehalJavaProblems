import java.util.Scanner;

public class wordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ans 1. Without usiung scanner

		/*
		 * String str = "My Name is Nehal Ahmed"; // String [] word =
		 * str.trim().split("\\s");
		 * 
		 * int wordcount = str.isEmpty()?0:str.split("\\s+").length;
		 * System.out.println("Total No of words  " + wordcount);
		 */

		// Ans 2. using scanner

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println(" Enter the String ");
		 * 
		 * String input = sc.nextLine().trim();
		 * 
		 * int wordcount = input.isEmpty()?0:input.split("\\s+").length;
		 * System.out.println(wordcount);
		 */

		// Using For loop

		String st = " My Name is Nehal Ahmed ";
		String wd = st.trim();

		int count = 0;

		/*
		 * for (int i = 0; i < wd.length(); i++) { char ch = wd.charAt(i); if (ch == '
		 * ') { count = count + 1; }
		 * 
		 * }
		 * 
		 * System.out.println(" Total space in the string: " + count);
		 */
		
		
		/// Using for each Loop 
		
		for(char ch : wd.toCharArray()) {
			if(ch==' ') {
				count++;
			}
		}
System.out.println(" Total Space in String : " + count );
	}

}
