package Prepartion;

public class lastOccuranceOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "hello word";
		
		char target = 'o';
		int lastindex = findlastOccurance(input, target);
		
		if(lastindex !=-1) {
			System.out.println("The Last occurance of " + target + " is at Index " + lastindex);
		}else {
			System.out.println(" The Character "+ target + " Does not Exist ");
		}
		
		
	}
	
	public static int findlastOccurance(String str, char ch) {
		
		for( int i = str.length()-1; i>=0; i-- ) {
			if(str.charAt(i)== ch) {
				return i;
			}
		}
		
		return -1;
		
	}

}
