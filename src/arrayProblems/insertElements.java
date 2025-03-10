package arrayProblems;

import java.util.Scanner;

public class insertElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         
			/*
			 * System.out.println("Enter the Elements "); int length = sc.nextInt(); int
			 * arr[] = new int [length]; System.out.println("enter the"+ length
			 * +"elements"); for (int i =0; i<arr.length;i++ ) { arr[i] = sc.nextInt(); }
			 * for(int i =0; i< arr.length;i++) { System.out.println
			 * ("arr	["+i+"]	---->"+arr[i]); }
			 */
         System.out.println("Enter the Elemnets");
         
         int length = sc.nextInt();
       int  arr[] = new int[length];
         
         System.out.println("Enter the"+ length + "Element");
         for(int i =0; i < arr.length;i++) {
        	 arr[i] = sc.nextInt();
         }
         for(int i =0; i <arr.length;i++) {
        	 System.out.println("arr["+i+"]--->"+arr[i]);
         }
         
         
         
	}

}
