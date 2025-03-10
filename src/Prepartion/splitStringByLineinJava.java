package Prepartion;

public class splitStringByLineinJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String input = "Hello, World!\nWelcome to Java programming.\nHave a great day!";
		
		String[] lines = input.split("\n");
		
		for(String line : lines) {
			System.out.println(line);
		}
	}

}
