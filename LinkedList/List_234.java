class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class List_234 {

    public boolean isPalindrome(ListNode head) {
        ListNode newList = reverseList(head);
        while (head != null) {
            if (head.val != newList.val) {
                return false;
            }
            head = head.next;
            newList = newList.next;
        }
        return true;
    }

    public ListNode reverseList(ListNode head) {
        ListNode newList = new ListNode();

        while (head != null) {
            ListNode node = new ListNode();
            node.val = head.val;
            node.next = newList.next;
            newList.next = node;
            head = head.next;
        }
        return newList.next;
    }
}
