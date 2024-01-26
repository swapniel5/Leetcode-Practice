package com.leetcode.practice.January2024;

public class Jan26 {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode mergedList1 = mergeTwoLists(list1, list2);
        System.out.println("Output 1: " + mergedList1);

        // Example 2
        ListNode list3 = null;
        ListNode list4 = null;
        ListNode mergedList2 = mergeTwoLists(list3, list4);
        System.out.println("Output 2: " + mergedList2);

        // Example 3
        ListNode list5 = null;
        ListNode list6 = new ListNode(0);
        ListNode mergedList3 = mergeTwoLists(list5, list6);
        System.out.println("Output 3: " + mergedList3);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // / Create a dummy node to simplify the code
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // Iterate until one of the lists is empty
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // Attach the remaining nodes of the non-empty list
        if (list1 != null) {
            current.next = list1;
        } else if (list2 != null) {
            current.next = list2;
        }

        return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        ListNode current = this;
        while (current != null) {
            result.append(current.val);
            if (current.next != null) {
                result.append(", ");
            }
            current = current.next;
        }
        result.append("]");
        return result.toString();
    }
}

