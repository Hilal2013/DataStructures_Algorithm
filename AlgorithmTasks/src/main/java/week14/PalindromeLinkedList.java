package week14;

public class PalindromeLinkedList {


    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head, prev, nextNode, current;
//find middle point
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
//reverse 2nd half of linkedlist
        prev=slow;
        current=slow.next;
        prev.next=null;//we break the reverse cycle and avoid endless loop

        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
       //palindrome check first half and second half
        ListNode left = head, right = prev;
        while (left != null && right != null) {
            if(left.val!=right.val)return false;
            left=left.next;
            right=right.next;

        }
return true;
    }


    public boolean isPalindromeWithString(ListNode head) {//runtime 17ms memory 53.4
        StringBuilder strBuilder = new StringBuilder();
        ListNode current = head;
        while (current != null) {
            strBuilder.append(current.val);
            current = current.next;

        }
        int left = 0;
        int right = strBuilder.length() - 1;
        while (left <= right) {
            if (strBuilder.charAt(left) != strBuilder.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}