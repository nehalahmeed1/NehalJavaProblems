package arrayProblems;

import java.util.Arrays;

public class ConcateTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int a[] = {5, 1, 1, 9, 7, 2, 6, 10};
	       int b[] = {11,12,13};
		String strA = Arrays.toString(a).replaceAll("[\\[\\]]", "");
		String strB = Arrays.toString(b).replaceAll("[\\[\\]]", "");
		String merged = strA.concat(", ").concat(strB);
		        System.out.print(merged+" ");
	}

}
