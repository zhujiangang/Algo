package com.leetcode;

public class PalindromeLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(1);
		ListNode node3 = new ListNode(2);
		ListNode node4 = new ListNode(1);
		ListNode node5 = new ListNode(1);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = null;
		//node5.next = null;
		System.out.println(isPalindrome(node1));
	}

	public static ListNode reverse(ListNode head){
        if(head==null)
            return null;
        ListNode p1 = head;
        ListNode p2 = head.next;
        head.next = null;
        while(p2!=null){
            ListNode p3 = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = p3;
        }
        return p1;
    }
    public static boolean isPalindrome(ListNode head) {
        if(head==null)
            return true;
        ListNode p1 = head;
        ListNode p2 = head;
        if(p2.next==null)
            return true;
        if(p2.next.next==null){
            if(p1.val== p2.next.val)
                return true;
            else
                return false;
        }
        boolean isDouble = false;
        while(p1.next!=null && p2.next!=null && p2.next.next!=null){
            p1 = p1.next;
            p2 = p2.next.next;
        }
        if(p2.next!=null)
        	isDouble = true;
        ListNode right = reverse(p1.next);
        if(!isDouble){
            ListNode p3 = head;
            ListNode p4 = right;
            while(p3!=null && !p3.equals(p1) && p4!=null){
                if(p3.val!=p4.val)
                    return false;
                p3 = p3.next;
                p4 = p4.next;
            }
        }else{
            ListNode p3 = head;
            ListNode p4 = right;
            boolean flag = false;
            while( !flag && p4!=null){
                if(p3.val!=p4.val)
                    return false;
                if(p3.equals(p1))
                    flag = true;
                p3 = p3.next;
                p4 = p4.next;
            }
        }
            
        // Stack<Integer> stack = new Stack<Integer>();
        // ListNode p3 = head;
        // while(p3.next!=p1)
        //     stack.push(p3.val);
        // if(p2.next!=null){
        //     stack.push(p1.val);
        // }
        // ListNode p4 = p1.next;
        // while(p4!=null){
        //     int v = stack.pop();
        //     if(p4.val!=v)
        //         return false;
        // }
        return true;
    }
}
