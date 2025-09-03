public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String input = "  Hello   World! This is   Java.  ";
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Check if the character is NOT a whitespace
            if (!Character.isWhitespace(currentChar)) {
                result.append(currentChar);
            }
        }

        // Output the result
        System.out.println("Original string: \"" + input + "\"");
        System.out.println("Without white spaces: \"" + result.toString() + "\"");
    }
}
