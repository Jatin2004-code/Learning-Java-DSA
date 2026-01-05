package LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Palindrome{
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        // 1. Middle find (slow–fast)
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // +1
            fast = fast.next.next;     // +2
        }

        // 2. Second half reverse
        ListNode prev = null;
        ListNode curr = slow;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        // Ab prev = head of reversed second half
        ListNode left = head;
        ListNode right = prev;

        // 3. Compare first half & reversed second half
        while (right != null) { // right chhota/equal hoga
            if (left.val != right.val) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }
}
