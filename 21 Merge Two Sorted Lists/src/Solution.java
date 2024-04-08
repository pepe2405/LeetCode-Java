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

class Solution {
    public ListNode mergeTwoLists(ListNode lhs, ListNode rhs) {
        if (lhs != null && rhs != null) {
            if (lhs.val < rhs.val) {
                lhs.next = mergeTwoLists(lhs.next, rhs);
                return lhs;
            } else {
                rhs.next = mergeTwoLists(lhs, rhs.next);
                return rhs;
            }
        }
        if (lhs == null) {
            return rhs;
        }

        return lhs;
    }
}