public class PalindromeChecker {
    public static void main(String[] args) {
        String original = "madam";
        System.out.println("Input Text: " + original);
        System.out.println("Is it a Palindrome: " + IsPalindrome(original));
    }

    public static boolean IsPalindrome(String s) {
        int n = s.length();

        for(int i = 0; i < n / 2; ++i) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
