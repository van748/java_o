package basica;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of the Rings";

		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word " + wordChoice);
		}

		String browser = "Chrome";
		// (browser == "chrome"; case sensitive
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is chrome");
		}

		String firstName = "Tim";
		String lastName = "Short";
		String SSN = "984162168";

		System.out.println("There are " + SSN.length() + " digits in your SSN.");

		// Print the initials plus last 4 digits of SSN and System.out.print will be in
		// the same LINE
		System.out.print(firstName.substring(0, 1)); // begin 0 an end 1 - pick up the first character of the string
		System.out.print(lastName.substring(0, 3)); // pick up the first
		System.out.print(SSN.substring(5)); // print contain after position 5 in the characters string

	}

}
