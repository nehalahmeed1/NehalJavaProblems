import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseOrderOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner sc = new Scanner(System.in);
	
	System.out.println(" Enter the String ");
	
	String input = sc.nextLine();
	
	String[] word = input.split(" ");
	Collections.reverse(Arrays.asList(word));
	
String reverse = String.join(" ", word);

System.out.println("Reverse String : "+ reverse);
	
	
	
	}
	
}

		
		
		
		
		
		
		
	

