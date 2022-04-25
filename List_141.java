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

public class List_141 {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode low = head;
        fast = fast.next.next;
        low = low.next;
        if (fast == low) {
            return true;
        }
        return false;
    }
}
