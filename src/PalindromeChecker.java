public class PalindromeChecker {

    // Array Method
    public static boolean arrayCheck(String input) {
        char[] arr = input.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right])
                return false;
            left++;
            right--;
        }
        return true;
    }

    // Stack Method
    public static boolean stackCheck(String input) {
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char ch : input.toCharArray())
            stack.push(ch);

        for (char ch : input.toCharArray())
            if (ch != stack.pop())
                return false;

        return true;
    }

    // Recursive Method
    public static boolean recursiveCheck(String str, int start, int end) {
        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return recursiveCheck(str, start + 1, end - 1);
    }

    // Linked List Node
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
        }
    }

    // Linked List Method
    public static boolean linkedListCheck(String input) {
        Node head = null, tail = null;

        for (char ch : input.toCharArray()) {
            Node newNode = new Node(ch);
            if (head == null)
                head = tail = newNode;
            else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node prev = null;
        while (slow != null) {
            Node next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        Node first = head, second = prev;

        while (second != null) {
            if (first.data != second.data)
                return false;

            first = first.next;
            second = second.next;
        }

        return true;
    }

    // Performance Test
    public static void performanceTest(String input) {
        long start, end;

        start = System.nanoTime();
        arrayCheck(input);
        end = System.nanoTime();
        System.out.println("Array Time: " + (end - start) + " ns");

        start = System.nanoTime();
        stackCheck(input);
        end = System.nanoTime();
        System.out.println("Stack Time: " + (end - start) + " ns");

        start = System.nanoTime();
        recursiveCheck(input, 0, input.length() - 1);
        end = System.nanoTime();
        System.out.println("Recursion Time: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedListCheck(input);
        end = System.nanoTime();
        System.out.println("LinkedList Time: " + (end - start) + " ns");
    }

    public static void main(String[] args) {
        String word = "madam";
        System.out.println("\n--- Performance Comparison ---");
        performanceTest(word);
    }
}



