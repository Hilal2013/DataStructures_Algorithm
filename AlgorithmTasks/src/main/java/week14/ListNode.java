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



}
/*
Given the head of a singly linked list, return true if it is a
palindrome or false otherwise.
Input: head = [1,2,2,1]
Output: true
Input: head = [1,2]
Output: false

 */