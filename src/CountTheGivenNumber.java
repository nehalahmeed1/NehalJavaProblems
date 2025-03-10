
public class CountTheGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5343272; int i=0;
	int	a=n;
	
	while(a>0) {
		a = a/10;
		i++;
		}
		System.out.println("No of digits present = " + i );
		
	}

}
