
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 145;
		int i=0,j=0;
		int a = n;
		while(a>0) {
			i = a%10;
			j= i+j;
			a=a/10;
		}
		System.out.println("Sum of Digits = " + j);
	}

}
