package Binary;

public class BrinaryToOctal {
	int binaryToDecimal(long binary) {

		int decimalNumber = 0, i = 0;

		while (binary > 0) {

			decimalNumber += Math.pow(2, i++) * (binary % 10);

			binary /= 10;
		}

		return decimalNumber;
	}

	int decimalToOctal(long binary) {

		int octalNumber = 0, i = 0;

		int decimalNumber = binaryToDecimal(binary);

		while (decimalNumber != 0) {

			octalNumber += (decimalNumber % 8) * ((int) Math.pow(10, i++));

			decimalNumber /= 8;
		}

		return octalNumber;
	}

	public static void main(String[] args) {

		BrinaryToOctal ob = new BrinaryToOctal();

		System.out.println("octal number:" + ob.decimalToOctal(100100));
	}
}
