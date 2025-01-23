package javaPractice;

public class SimplePermutations {
	
	 public static void printPermutations() {
	        String str = "abc"; // The string to permute
	        permute(str, "");   // Start the permutation process
	    }

	    private static void permute(String str, String result) {
	        // Base case: if the input string is empty, print the result
	        if (str.isEmpty()) {
	            System.out.println(result);
	            return;
	        }

	        // Recursive case: iterate through each character in the string
	        for (int i = 0; i < str.length(); i++) {
	            char currentChar = str.charAt(i);  // Choose the current character
	            String remaining = str.substring(0, i) + str.substring(i + 1); // Remove chosen character
	            permute(remaining, result + currentChar); // Recursive call
	        }
	    }

	    public static void main(String[] args) {
	        printPermutations(); // Call the function to start
	}


//    public static void printPermutations() {
//        String str = "abc"; // Define the string here
//
//        // Base case: if the string is empty, print the result
//        if (str.isEmpty()) {
//            System.out.println(str);
//            return;
//        }
//
//        // Loop through the string
//        for (int i = 0; i < str.length(); i++) {
//            // Create the new string without the character at index i
//            String remaining = str.substring(0, i) + str.substring(i + 1);
//
//            // Print the permutation by adding the character to the result
//            System.out.println(str.charAt(i) + remaining);
//        }
    
}