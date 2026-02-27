public class PalindromeChecker{
    public static boolean stackCheck(String original) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char ch : original.toCharArray())
            stack.push(ch);
        for (char ch : original.toCharArray())
            if (ch != stack.pop()) {
                return false;
            }
        return true;
    }
    public static void main(String[] args) {
        String original = "madam";
        System.out.println("Input Text: " + original);
        System.out.println("Is it a palindrome: " + stackCheck(original));
    }
}


