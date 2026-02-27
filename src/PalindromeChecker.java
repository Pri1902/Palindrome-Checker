public class PalindromeChecker {
    public static void main(String[] args) {
        String original = "madam";
        System.out.println("Input Text: " + original);
        char[] chars = original.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        boolean isPalindrome;
        for(isPalindrome = true; start < end; --end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
            }

            ++start;
        }

        System.out.println("Is it a palindrome: " + isPalindrome);
    }
}
