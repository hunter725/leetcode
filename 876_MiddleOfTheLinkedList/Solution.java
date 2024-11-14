/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int i = getNumOfList(head);
        int middleNum = i / 2 + 1;
        ListNode middle = null;
        for (int j = 0; j < middleNum; j++) {
            if (j == 0) middle = head;
            else middle = middle.next;
        }
        return middle;
    }

    public int getNumOfList(ListNode head) {
        int i = 0;
        ListNode node = head;
        while (node != null) {
            node = node.next;
            i++;
        }
        return i;
    }
}