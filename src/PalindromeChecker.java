
public class PalindromeChecker{
        public static boolean checkPalindrome(String input) {

            int left = 0;
            int right = input.length() - 1;

            while (left < right) {
                if (input.charAt(left) != input.charAt(right))
                    return false;

                left++;
                right--;
            }

            return true;
        }

    public static void main(String[] args) {
        String original = "madam";
        System.out.println("Input Text: " + original);
        System.out.println("Is it a palindrome: " + checkPalindrome(original));
    }
}


