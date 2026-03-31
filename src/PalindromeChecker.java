
public class PalindromeChecker{
     public static boolean normalizedCheck(String input) {

        String clean = input.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = clean.length() - 1;

        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right))
                return false;
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String original = "madam";
        System.out.println("Input Text: " + original);
        System.out.println("Is it a palindrome: " + normalizedCheck(original));
    }
}


