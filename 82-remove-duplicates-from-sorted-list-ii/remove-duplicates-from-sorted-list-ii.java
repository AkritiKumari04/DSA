class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        // Dummy node to handle duplicates at the beginning
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {

            // Check if current node has duplicates
            if (curr.next != null && curr.val == curr.next.val) {

                // Skip all nodes with the same value
                while (curr.next != null && curr.val == curr.next.val) {
                    curr = curr.next;
                }

                // Remove all duplicate nodes
                prev.next = curr.next;

            } else {
                // Current node is unique
                prev = prev.next;
            }

            curr = curr.next;
        }

        return dummy.next;
    }
}