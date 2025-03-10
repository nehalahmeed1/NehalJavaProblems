import java.util.Scanner;

public class countTotalVowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println(" The String "); String input = sc.nextLine(); // String
		 * str = " hwdwd dgwd daoqw e wdbieas"; int vowels = 0, constants = 0;
		 * 
		 * for (int i = 0; i < input.length(); i++) {
		 * 
		 * char ch = input.charAt(i);
		 * 
		 * for(int i = 0; i< str.length();i++) { char ch = str.charAt(i);
		 * 
		 * //if (Character.isLetter(ch)) { if (ch == 'a' || ch == 'e' || ch == 'i' || ch
		 * == 'o' || ch == 'u') { vowels++; } else { constants++; } } // }
		 * System.out.println(" Total vowels  " + vowels);
		 * System.out.println(" Total constants  " + constants); sc.close();
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter The String ");
		
		String str = sc.nextLine();
		
	//	String str = "hwdwd dgwd daoqw e wdbieas";
		 String low = str.toLowerCase();

		int vowels = 0, costants =0;
		
		for( Character ch : low.toCharArray()){
		    if( ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
		     vowels++;
		}else {
			costants++;
		}
		
		}
		System.out.println(" Total Vowels :" + vowels);
		System.out.println(" Total Constants :" + costants);
		}
}