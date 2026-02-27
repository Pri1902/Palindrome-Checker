public class PalindromeChecker{
    public static boolean dequeCheck(String original) {

        java.util.Deque<Character> deque = new java.util.ArrayDeque<>();

        for (char ch : original.toCharArray())
            deque.add(ch);

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast()))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String original = "madam";
        System.out.println("Input Text: " + original);
        System.out.println("Is it a palindrome: " + dequeCheck(original));
    }
}


