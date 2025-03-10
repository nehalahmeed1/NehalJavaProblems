import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class frequenceCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the String ");
		
		String input = sc.nextLine().toLowerCase();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char ch : input.toCharArray()){
            if(map.get(ch)== null) {
            	
            	map.put(ch, 1);
            	
            }else {
            	map.put(ch, map.get(ch)+1);
            }
		}
		
		map.forEach((key, value)-> {
			System.out.println(key + " Occured : " + value);
		}
		);
	}
	}