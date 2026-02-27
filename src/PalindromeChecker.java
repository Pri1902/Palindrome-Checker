public class PalindromeChecker{
    public static boolean queueStackCheck(String original) {
        java.util.Queue<Character> queue = new java.util.LinkedList<>();
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char ch : original.toCharArray()) {
            queue.add(ch);
            stack.push(ch);
        }
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop()))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String original = "madam";
        System.out.println("Input Text: " + original);
        System.out.println("Is it a palindrome: " + queueStackCheck(original));
    }
}


