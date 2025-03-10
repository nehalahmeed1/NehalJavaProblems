package Prepartion;

import java.security.SecureRandom;
import java.util.Random;
import java.util.UUID;

public class generateRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = 10;
		String randomString = generateRandomString(length);
		String secureString = secureRandomString(length);

		System.out.println(" RandomString : "+randomString);
		System.out.println(" SecureString : "+secureString);
		
		String uuid = uuId();
		System.out.println(" UUID : "+ uuid);
	}
		
	public static String generateRandomString(int length) {
		
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		
		Random random = new Random();
		
		StringBuilder sb = new StringBuilder();
		
		
		for( int i =0; i < length ; i++ ) {
			int index = random.nextInt(characters.length());
			sb.append(characters.charAt(index));
		}
		
		return sb.toString();
			
	

		
	}

		
// Secure Random 
		
		public static String secureRandomString( int length) {
			
			String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
			
			SecureRandom secureRandom = new SecureRandom();
			
			StringBuilder stringBuilder = new StringBuilder();
			
			for(int i =0; i < length ; i ++) {
				
				int index = secureRandom.nextInt(characters.length());
				
				stringBuilder.append(characters.charAt(index));
				
			}
			
			
			return stringBuilder.toString();		
			
			
		}
	
			
// Using UUID
		
		public static String uuId( ) {
			
		String uuid = UUID.randomUUID().toString();
		
		return uuid;
			
			
		}
	
}
