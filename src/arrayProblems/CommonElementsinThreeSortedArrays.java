package arrayProblems;

public class CommonElementsinThreeSortedArrays {

	
	public static void repatedElement(int [] a, int [] b, int []c ) {
		
		int i = 0;
		int j = 0;
		int k = 0;
		/*
		 * while(i<a.length && j<b.length && k< c.length) {
		 */
			
		
			for(;i<a.length && j<b.length && k< c.length;) {
			
			if( a[i]== b[j] && b[j]== c[k]) {
				System.out.println(a[i]+ "  ");
				i++; j++; k++;
				
			}
			else if(a[i]<b[j]) {
				i++;
			}
			else if (b[j]<c[k]) {
				j++;
			}else {
				k++;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 5, 10, 20, 40, 80 };

		int[] b = { 6, 11, 20, 55, 78 };

		int[] c = { 8, 20, 30, 57, 87 };
		
		
		repatedElement(a,b,c);
		
		
	}

}
