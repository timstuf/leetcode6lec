package com.nix;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val1 = 0, val2 = 0;
        ListNode temp = new ListNode(0);
        ListNode result = temp;
        boolean moreThenTen = false;
        while (l1 != null || l2 != null) {
            if (l1 == null && l2 != null) {
                val2 = l2.val;
                val1 = 0;
            }
            if (l1 != null && l2 == null) {
                val1 = l1.val;
                val2 = 0;
            }
            if (l1 != null && l2 != null) {
                val1 = l1.val;
                val2 = l2.val;
            }
            if (moreThenTen) val1 += 1;
            if (val1 + val2 < 10) {
                temp.val = val1 + val2;
                moreThenTen = false;
            } else {
                temp.val = val1 + val2 - 10;
                moreThenTen = true;
            }
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            if (l1 != null || l2 != null) {
                temp.next = new ListNode(0);
                temp = temp.next;
            }


        }
        if (moreThenTen) temp.next = new ListNode(1);
        return result;
    }
}
