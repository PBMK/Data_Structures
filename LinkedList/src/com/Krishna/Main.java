package com.Krishna;

import java.util.LinkedList;

public class Main {


    Node head;

    static class Node{
        Node next;
        int data;
        Node(int d){
            data = d;
            next = null;

        }

    }
    public static void main(String[] args) {

        LinkedList llist = new LinkedList();
        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);


        llist.head.next = second;
        second.next = third;

        Node n = head;
        while (n!= null)
        {
            System.out.println(n.data);
            n= n.next;
        }
    }

}
