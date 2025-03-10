import java.util.concurrent.ThreadLocalRandom;
public class randomnumbersbtwngvnrange {

	// Write a program to generate random number between the given value
	
	/*
	 * public static int getRandomValue(int Min, int Max) { return
	 * ThreadLocalRandom.current().nextInt(Min, Max+1);
	 * 
	 * }
	 * 
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * int Min =1, Max =100;
	 * 
	 * System.out.println("Random Value between " + Min + " and " + Max + " : " +
	 * getRandomValue(Min, Max));
	 * 
	 * 
	 * }
	 * 
	 *
	 */
	
	
	public static int getRandomValue(int Min, int Max) {
		return ThreadLocalRandom.current().nextInt(Min, Max);	
		
	}
	
public static void main (String args[]) {
	
	
	int Min=100, Max =200;
	System.out.println("Random Value between " + Min + " and " + Max +" : " + getRandomValue(Min, Max));
	
}

		
	}

