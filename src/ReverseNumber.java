
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 12345;
		int a =n;
		int i=0, j =0;
		
		while(a>0) {
			i =a%10;
			j=(j*10)+i;
			a= a/10;
		}
		System.out.println("Reverse Number is " +  j);
		
	}

}
