package algorithms.Q206_Reverse_Linked_List;

import algorithms.common.ListNode;

public class Solution {

    public static ListNode reverseList(ListNode head) {
        //iteratively solution
//        if(head == null) return null;
//        ListNode cur = head;
//        ListNode next = cur.next;
//        while (next != null){
//            ListNode pre = cur;
//            cur = next;
//            next = cur.next;
//            cur.next = pre;
//        }
//
//        head.next = null;
//        return cur;

        //recursively solution

        if(head == null || head.next == null){
            return head;
        }

        ListNode ret = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return ret;
    }

    public static void main(String[] args) {
        ListNode listNode = reverseList(getNodes());
        System.out.println(listNode);
    }

    private static ListNode getNodes(){
        ListNode l3 = new ListNode(3);
        ListNode l4 = (l3.next = new ListNode(4));
        ListNode l5 = (l4.next = new ListNode(5));
        return l3;
    }
}
