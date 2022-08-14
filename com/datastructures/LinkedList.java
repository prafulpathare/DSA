package com.datastructures;

import com.model.ListNode;

public class LinkedList {

    ListNode head;

    public LinkedList() {
        this.head = null;
    }
    public LinkedList(int value) {
        this.head = new ListNode(value);
        this.head.next = null;
    }
    LinkedList add(LinkedList list, int value) {
        if (list.head == null) {
            list.head = new ListNode(value);
            return list;
        }
        ListNode tempNode = list.head;
        while (tempNode.next != null)
            tempNode = tempNode.next;
        tempNode.next = new ListNode(value);
        return list;
    }

    void traverse() {
        ListNode tempNode = head;
        while (tempNode != null) {
            System.out.printf("%d ", tempNode.value);
            tempNode = tempNode.next;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(linkedList,40);
        linkedList.add(linkedList,20);
        linkedList.add(linkedList,55);
        linkedList.add(linkedList,90);

        linkedList.traverse();

    }
}
