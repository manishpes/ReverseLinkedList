package com.practice.List;

public class ReverseList {

    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public static void main(String args[])
    {
        Node node = new  Node( 1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(5);
        System.out.println("List");
        printList(node);
        Node reverseNode  = reverseList(node);
        System.out.println("Reversed List");
        printList(reverseNode);
    }

    private static Node reverseList(Node head)
    {
        Node prev = null;
        Node cur = head;
        Node next1 = null;

        while (cur != null)
        {
        next1 = cur.next;
        cur.next = prev;
        prev = cur;
        cur = next1;
        }
        head = prev;
        return head;

    }
    private static void printList(Node node)
    {
     while (node != null)
     {
         System.out.println(node.data);
         node = node.next;
     }

    }


}
