import helper.ListNode;

public class Exercise3 {
    /**
     * this method takes the head of a singly linked list and reverses the order of its nodes.
     * It does this by iteratively reversing the pointers between nodes, starting from the head.
     * The method returns the new head of the reversed list.
     *
     * @param head The given LinkedList.
     * @return Reversed LinkedList.
     */
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = null;
        ListNode current = head;
        ListNode next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}


