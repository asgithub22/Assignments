package stringOperations;

public class removeDuplicateCharacter {

	public static void main(String[] args) {
		String input = "Sasarammchanndara";
		String result = "";

		for (int i = 0; i < input.length(); i++) { // loop start from ith position to till length of string
			char ch = input.charAt(i); // extract the character one by one

			// Add character only if it's not already in the result
			if (!result.contains(String.valueOf(ch))) {
				result += ch;
			}
		}

		System.out.println("Original: " + input); // print original string
		System.out.println("Without duplicates: " + result); // print duplicate removed string

	}

}
