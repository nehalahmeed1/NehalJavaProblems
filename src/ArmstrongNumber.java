
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Armstrong number is a number that is equal to the sum of cubes of its digits
		
		int n= 153; int sum =0; int rem=0;
		
		int a = n;
		while(a>0) {
			sum  = a%10;
			rem = (sum*sum*sum)+rem;
			a=a/10;
			
		}
		if(n==rem) {
			System.out.println("is a Armstrong number");
		}
		else {
			System.out.println("Not Armstrong");
		}
		}
	}


