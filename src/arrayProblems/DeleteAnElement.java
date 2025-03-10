package arrayProblems;

import java.util.Scanner;

public class DeleteAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length");
		int length = sc.nextInt();
		int ar[] = new int[length];
		System.out.println("enterthe " + length + "	elements");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		System.out.println("length	of	array	before	deleting" + "--->" + ar.length);
		display(ar);
		System.out.println("enter specified position for deleting that element");
		int in = sc.nextInt();
		ar = delete(ar, in);
		display(ar);
	}

	static void display(int a[]) {
		for (int i = 0; i < a.length; i++)
			System.out.println(i + "------->" + a[i]);
	}

	static int[] delete(int a[], int in) {
		if (in > a.length || in < 0) {
			System.out.println("invalid	index");
			return a;
		} else {
			int na[] = new int[a.length - 1];
			for (int i = 0; i < in; i++) {
				na[i] = a[i];
			}
			for (int i = in; i < a.length; i++) {
				na[i - 1] = a[i];
			}
			System.out.println("length of array after deleting" + "---->" + na.length);
			return na;
		}

	}
}
