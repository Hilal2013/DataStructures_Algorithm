package week14;

import java.util.Stack;

public class ListNode {

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

    public void put(ListNode head, int val) {

        ListNode node = new ListNode(val);

        if (head == null) {
            head = null;
        } else {
            node = head.next;

        }


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


    public boolean isPalindrome(ListNode head) {
        ListNode current = head;
        while (current != null) {

            if (reverse(head).val != current.val) {
                return false;
            }
            current = current.next;
        }


        return true;
    }

    public void put(ListNode head) {



        if (head == null) {
            head = null;
        } else {
            head = head.next;

        }

    }
        public ListNode reverseWithStack(ListNode head) {
        Stack<Integer> stack = new Stack<>();

        while(head!=null){
            stack.push(head.val);
            head=head.next;
        }

        while(stack.size()>0){

            ListNode reverse=new ListNode(stack.pop());

        }
        return null;
    }



    public ListNode reverse(ListNode head) {
        //123 //321
        ListNode current = head;//1
        ListNode temp = null;//initialized as null
        ListNode prev = null;//


        while (current != null) {//will run until the head of linkedlist becomes null
           temp=current.next;//2//3//1
           current.next=prev;//current.next will be null//1//2
            prev=current; //1//2
            current=temp;//2//3


        }
        return prev;

    }

}
/*
Given the head of a singly linked list, return true if it is a
palindrome or false otherwise.
Input: head = [1,2,2,1]
Output: true
Input: head = [1,2]
Output: false

 */