/**
 * ============================================================
 * MAIN CLASS – UseCase13PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class compares execution time of different
 * palindrome checking algorithms.
 *
 * @author Developer
 * @version 13.0
 */

public class UseCase13PalindromeCheckerApp {

    // Two-pointer method
    public static boolean twoPointerCheck(String word) {

        int start = 0;
        int end = word.length() - 1;

        while (start < end) {

            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    // Reverse string method
    public static boolean reverseCheck(String word) {

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        return word.equals(reversed);
    }

    public static void main(String[] args) {

        String word = "madam";

        // Measure two-pointer time
        long startTime1 = System.nanoTime();
        boolean result1 = twoPointerCheck(word);
        long endTime1 = System.nanoTime();

        // Measure reverse method time
        long startTime2 = System.nanoTime();
        boolean result2 = reverseCheck(word);
        long endTime2 = System.nanoTime();

        System.out.println("Two Pointer Result: " + result1);
        System.out.println("Two Pointer Time: " + (endTime1 - startTime1) + " ns");

        System.out.println("Reverse Method Result: " + result2);
        System.out.println("Reverse Method Time: " + (endTime2 - startTime2) + " ns");

    }
}