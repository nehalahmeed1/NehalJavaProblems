package Binary;

public class De {
	

	// function to convert decimal to octal
	int decimalToOctal(long binary)
	{
		// variable to store the decimal number
		// returned by the binaryToDecimal()
		int decimalNumber = 72;
		// using the toOctalString() to convert
		// Integer to String of Octal Number
		String octalString
			= Integer.toOctalString(decimalNumber);

		// converting the String of octal number
		// to an Integer
		int octalNumber = Integer.parseInt(octalString);

		// returning the octal number
		return octalNumber;
	}
	public static void main(String[] args)
	{
		// instantiating the class
		De ob = new De();

		// calling and printing the decimalToOCtal
		// method
		System.out.println("octal number:"
						+ ob.decimalToOctal(100100));
	}
}
