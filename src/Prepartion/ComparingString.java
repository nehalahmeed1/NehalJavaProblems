package Prepartion;

public class ComparingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// The equals() method compares the content of two strings. It is
		// case-sensitive.
		String st1 = "OpenAI";
		String st2 = "OpenAI";
		String st3 = "Openai";

		System.out.println(" equals() method  ");
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(st3));

		/*
		 * //2. Using equalsIgnoreCase() //This method compares two strings, ignoring
		 * case considerations.\
		 * 
		 */

		System.out.println(" Using equalsIgnoreCase() ");
		System.out.println(st1.equalsIgnoreCase(st2));
		System.out.println(st1.equalsIgnoreCase(st3));

		/*
		 * 3. Using compareTo() The compareTo() method is used for lexicographical
		 * comparison. It returns:
		 */

		System.out.println(" Using compareTo() ");
		System.out.println(st1.compareTo(st2));
		System.out.println(st1.compareToIgnoreCase(st3));

		/*
		 * 4. Using == Operator The == operator compares the memory references of two
		 * strings. It does not compare content unless the strings are interned or
		 * explicitly point to the same object.
		 */
		System.out.println(" Using == Operator ");
		System.out.println(st1 == st2);
		System.out.println(st1 == st3);

		/*
		 * 5. Using contentEquals() This method checks if the string matches the content
		 * of a CharSequence (like a StringBuilder or StringBuffer).
		 */

		String str1 = "OpenAI";
		StringBuilder str2 = new StringBuilder("OpenAi");

		System.out.println(" contentEquals() ");
		boolean isEqual = str1.contentEquals(str2);
		System.out.println("Does str1 content equal str2? " + isEqual);

	}

}
