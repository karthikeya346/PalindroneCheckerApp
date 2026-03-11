/**
 * ============================================================
 * MAIN CLASS – UseCase10PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 10: Case-Insensitive & Space-Ignored Palindrome
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by ignoring spaces and case differences.
 *
 * @author Developer
 * @version 10.0
 */

public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "Madam In Eden Im Adam";

        // Normalize string
        String normalized = word.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }

    }
}