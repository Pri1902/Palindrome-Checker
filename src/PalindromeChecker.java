public class PalindromeChecker {
    public static void main(String[] args) {
        String original = "madam";
        String reversed = "";
        System.out.println("Input Text: " + original);

        for(int i = original.length() - 1; i >= 0; --i) {
            reversed = reversed + original.charAt(i);
        }

        if (original.equals(reversed)) {
            System.out.println("Is it a palindrome: True");
        } else {
            System.out.println("Is it a palindrome: False");
        }
    }
}
