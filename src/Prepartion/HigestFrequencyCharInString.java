package Prepartion;

import java.util.HashMap;

public class HigestFrequencyCharInString {

//// Write a  program to find highest frequency character in a string.	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input = " frequency character ";
		
   HashMap<Character, Integer> map = new HashMap<>();
   
   char maxChar = input.charAt(0);
   
   int maxFrequncy = 0; // Intial stage count = 0 
   
   for(char ch : input.toCharArray()) {
	  
	   int frequency = map.getOrDefault(ch, 0)+1;
	   
	   map.put(ch, frequency);
	   if(frequency > maxFrequncy) {
		   maxFrequncy = frequency;
		   maxChar = ch;
	   
   }
		
			
		}
	System.out.println(maxChar + " Count "+ maxFrequncy);
	
	}

}
