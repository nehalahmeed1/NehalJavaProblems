
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String orginal =" Nehal Ahmed", reverse="";
		//int length = orginal.length();
		for(int i = orginal.length()-1;i>0;i--) {
			reverse = reverse + orginal.charAt(i);
		//	System.out.println("reverse string is = " + reverse);
		}
		System.out.println("reverse string is = " + reverse);
	}
 
}
