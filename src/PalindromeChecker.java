
public class PalindromeChecker{
    interface PalindromeStrategy {
        boolean check(String input);
    }

        public static boolean stackCheck(String input) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char ch : input.toCharArray())
            stack.push(ch);

        for (char ch : input.toCharArray())
            if (ch != stack.pop())
                return false;

        return true;
    }

    static class StackStrategy implements PalindromeStrategy {

        public boolean check(String input) {
            return stackCheck(input);
        }
    }

        public static boolean dequeCheck(String input) {

        java.util.Deque<Character> deque = new java.util.ArrayDeque<>();

        for (char ch : input.toCharArray())
            deque.add(ch);

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast()))
                return false;
        }

        return true;
    }

    static class DequeStrategy implements PalindromeStrategy {

        public boolean check(String input) {
            return dequeCheck(input);
        }
    }

    public static void main(String[] args) {
        String word = "madam";
        PalindromeStrategy strategy;

        strategy = new StackStrategy();
        System.out.println(word + (strategy.check(word) ?
                " is a Palindrome (Stack Strategy)" :
                " is NOT a Palindrome (Stack Strategy)"));

        strategy = new DequeStrategy();
        System.out.println(word + (strategy.check(word) ?
                " is a Palindrome (Deque Strategy)" :
                " is NOT a Palindrome (Deque Strategy)"));

    }
}



