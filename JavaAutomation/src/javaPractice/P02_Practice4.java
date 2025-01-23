package javaPractice;

import java.util.ArrayList;
import java.util.List;

public class P02_Practice4 {

    public static void printPermutations() {
        String str = "abc"; // The string to permute
        List<String> permutations = new ArrayList<>();
        permutations.add(""); // Start with an empty string

        // Loop through each character of the input string
        for (char c : str.toCharArray()) {
            List<String> newPermutations = new ArrayList<>();

            // Generate new permutations by inserting the current character into every position
            for (String perm : permutations) {
                for (int i = 0; i <= perm.length(); i++) {
                    String newPerm = perm.substring(0, i) + c + perm.substring(i);
                    newPermutations.add(newPerm);
                }
            }

            // Update the list of permutations
            permutations = newPermutations;
        }

        // Print all the generated permutations
        for (String perm : permutations) {
            System.out.println(perm);
        }
    }

    public static void main(String[] args) {
        printPermutations(); // Call the function to print permutations
        }
}