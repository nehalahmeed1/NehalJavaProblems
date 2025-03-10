import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//A palindromic number is a number that remains the same when its digits are reversed.
		
/*		int n =121;
		
	int a=n; int i=0,j=0;
		
		while(a > 0) {
			i = a%10;
			j=(j*10)+i;
			a=a/10;
		}
		if(n==j) {
			System.out.println(" Is a Palindrome number " +j);
		}
		else {
			System.out.println(" Not A Palindrome number ");
		}
	}
	*/
	
	
	    Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the Number ");
		
		String input = sc.nextLine();
	
		boolean isPalindrome = input.equalsIgnoreCase(new StringBuilder(input).reverse().toString());
		
		System.out.println(isPalindrome);
		
	}
	
	

}
