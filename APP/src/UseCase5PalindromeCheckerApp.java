import java.util.Stack;

/**
 * ============================================================
 * MAIN CLASS – UseCase5PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 5: Stack-Based Palindrome Checker
 *
 * Description:
 * This class demonstrates palindrome validation
 * using a Stack data structure.
 *
 * At this stage, the application:
 * - Pushes characters of the string into a stack
 * - Pops characters in reverse order
 * - Builds the reversed string
 * - Compares original and reversed values
 * - Displays the result on the console
 *
 * This demonstrates how stack follows the
 * Last-In-First-Out (LIFO) principle.
 *
 * @author Developer
 * @version 5.0
 */

public class UseCase5PalindromeCheckerApp {

    /**
     * Application entry point for UC5.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String word = "madam";

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        String reversed = "";

        // Pop characters to create reversed string
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Compare original and reversed strings
        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }

    }
}