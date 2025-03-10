package Prepartion;

public class CheckCharIsUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = " Nehal Ahmed";

String h = str.trim();
for( char ch : h.toCharArray()) {
	
	if( Character.isUpperCase(ch)) {
	
		System.out.println("Is Upper Cases :"+ ch);
		
	}else {
		
		System.out.println("Is not Upper Case :"+ ch);
	}
	
}

	}

}
