
public class Repativecharecter {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

String str = new String("Neeeehaal");
char[] ch = str.toCharArray();

int count ;
		for(int i =0; i<ch.length;i++) {
			count =1;
			for(int j=i+1;j<ch.length;j++) {
					if(ch[i]==ch[j]) {
						System.out.println("Duplicate charecters in String : " + ch[i]+" "+count);

						count++;
					}
				
				}

		
		
	
	}
	}}

	

		
	
	
	

