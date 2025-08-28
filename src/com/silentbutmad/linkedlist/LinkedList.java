package com.silentbutmad.linkedlist;

public class LinkedList {
    Node head;
    int length=0;
    class Node {
        Object data;
        Node next;
        Node(Object data)
        {
            this.data=data;
            this.next=null;
        }
    }
    void printList()
    {
        if(head==null)
        {
            System.out.println("[]");
        }
    }
    void addFirst(Object data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=newNode;
            length++;
            return;
        }
        newNode.next=head;
        head=newNode;
        length++;
    }

}
