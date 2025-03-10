
public class SwapTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write a Java program to Swap Two String varaible without using temp Variable 
		
		
		String a = "Hello";
		String b = "World";
		
		System.out.println(" String before swap :a = " + a + " and " + b);
		
		a = a + b ;
		System.out.println(a);
		
		b = a.substring(0, a.length() - b.length());
		
		System.out.println(b);
		
		a = a.substring(b.length());
		
		System.out.println(a);
		
		System.out.println("String after swap : a = " + a + " and b = " +b );
	}

}
