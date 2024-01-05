<<<<<<< HEAD
class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode current = head;
        ListNode prev = null;
        while(current != null)
        {
            ListNode temp = current.next;
            current.next= prev;
            prev = current;
            current = temp;
        }

        return prev;
    }
=======
class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode current = head;
        ListNode prev = null;
        while(current != null)
        {
            ListNode temp = current.next;
            current.next= prev;
            prev = current;
            current = temp;
        }

        return prev;
    }
>>>>>>> d01d636a86ee4c8f6902a6c21cd8cc1f81b4cb00
}