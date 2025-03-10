public class palindromeUsingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 121;
		int n = a, i=0,j=0;
		while(a > 0) {
			i = n%10;
			j =(j*10)+i;
			n=n/10;
		}
		if (a ==j) {
			System.out.println(" Is a Palindrome " + j);
		}else {
			System.out.println(" Not a palindrome ");
		}

}
}