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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count += 1;
            temp = temp.next;
        }
        int k = count - n;
        if(k == 0){
            ListNode newHead = head.next;
            head = null;
            return newHead;
        }
        temp = head;
        while(temp != null){
            k--;
            if(k == 0){
                break;
            }
            temp = temp.next;
        }

        temp.next = temp.next.next;
      
        return head;
    }
}