import java.util.Scanner;

public class EvenOrOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		*/
	int	evenCount=0; int oddCount=0;
		for(int n=1;n<=100;n++) {
			if(n%2 == 0) {
				evenCount++;
				System.out.println("Even " + n);
			}else {
				oddCount++;
				System.out.println("Odd " + n);
		}	
		}
		System.out.println("Even " + evenCount);
		System.out.println("Odd  " + oddCount);
	
	}

}
