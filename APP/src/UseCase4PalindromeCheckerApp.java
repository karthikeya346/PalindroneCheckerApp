/**
 * ============================================================
 * MAIN CLASS – UseCase4PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 4: Character Array Based Validation
 *
 * Description:
 * This class validates a palindrome by converting
 * the string into a character array and comparing
 * characters using the two-pointer technique.
 *
 * At this stage, the application:
 * - Converts string to char array
 * - Uses start and end pointers
 * - Compares characters efficiently
 * - Displays the result
 *
 * This reduces extra memory usage.
 *
 * @author Developer
 * @version 4.0
 */

public class UseCase4PalindromeCheckerApp {

    /**
     * Application entry point for UC4.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String word = "madam";

        char[] characters = word.toCharArray();

        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        while(start < end) {

            if(characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if(isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }

    }
}