package Prepartion;

public class CheckStringIsUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String cs = "NEHAL aHMED";
     String h = cs.strip().trim();
    System.out.println(isUpperCase(cs));
    
    System.out.println("CheckStringIsUpperCase Using LOOP  : "+ isUpperCaseLoop(h));
	}
     
    public static boolean isUpperCase(String str) {
		return str.equals(str.toUpperCase());
    	 
    	 
     }
    
    
    
    public static boolean isUpperCaseLoop(String str) {
    	
    	for( char c : str.toCharArray()) {
    		
    		if(Character.isLetter(c) && !Character.isUpperCase(c)) {
    			return false;
    		}
    	}
    	
    	
		return true;
    	
    	
    }
    
    
    
    
    
	}


