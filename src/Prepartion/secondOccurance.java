package Prepartion;

public class secondOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input  = " Nehal Ahmed";
		
		char target = 'e';
		int occuranceCount = 0;
		
		for( int i =0; i< input.length(); i++) {
			//char c = input.charAt(i);
			if(target == input.charAt(i)) {
				occuranceCount++;
				if(occuranceCount==2) {
					System.out.println("The Secound Occurance of :" + target + " is at index " + i);
					return;
				}
			}
		}
		System.out.println("The Character " + target + " Does not ocurance twice");
	}

}
