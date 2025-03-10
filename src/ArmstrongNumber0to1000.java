
public class ArmstrongNumber0to1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int n=1; n<=1000;n++) {
			int a=n; int i=0,j=0;
			while(a>0) {
				i = a%10;
				j=j+(i*i*i);
				a= a/10;
			}
			if(n==j) {
				System.out.println("Is a ArmStrong Number = " +  j);
			}
			
		}
	}

}
