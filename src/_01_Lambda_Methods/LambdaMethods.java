package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.

		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s) -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");

		// 2. Call the printCustonMessage method using a lambda so that the String
		// prints backwards.
		printCustomMessage((s) -> {
			String reverse = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				reverse = reverse + s.charAt(i);
			}
			s = reverse;
			System.out.println(s);
		}, "DONEDO");
		// 3. Call the printCustonMessage method using a lambda so that the String
		// prints with a mix between upper an lower case characters.
		printCustomMessage((s) -> {
			String r = "";
			for (int i = 0; i < s.length(); i++) {
				if (i % 2 == 0) {
					r += s.substring(i, i + 1).toUpperCase();
				} else {
					r += s.substring(i, i + 1);
				}
			}
			s = r;
			System.out.println(s);
		}, "stringupdown");
		// 4. Call the printCustonMessage method using a lambda so that the String
		// prints with a period in between each character.
		printCustomMessage((s) -> {
			String period = "";
			for (int i = 0; i < s.length(); i++) {
				period += s.charAt(i) + ".";
			}
			s = period;
			System.out.println(s);
		}, "adding dots");
		// 5. Call the printCustonMessage method using a lambda so that the String
		// prints without any vowels.
		printCustomMessage((s) -> {
				System.out.println(s.replaceAll("[aAeEiIoOuU]", ""));
		}, "mememem");
	}

	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}