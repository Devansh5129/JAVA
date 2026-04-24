package LL;
import org.w3c.dom.Node;

import java.util.*;
public class ll {
    private Node head;
    private Node tail;
    private int size ;

    public ll(){
        this.size=0;

    }
    public void insertFirst(int val){
        Node node= new Node(val);
        node.next=head;
        head =node;

        if(tail==null){
            tail=head;
        }
        size=size+1;

    }
    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return ;
        }
        if (index == size) {
            insertLast(val);
            return ;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }
    public int delete(int index){
        if(index==0){
            return deleteFirst();

        }
        Node prev = get (index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }





    public void display(){
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.value+" -> ");
            temp =temp.next;
        }
        System.out.println("END");
    }
    private class Node{
        private int value ;
        private Node next;
        public Node(int value) {
            this.value = value;
        }
            public Node (int value, Node next){
                this.value = value;
                this.next = next;
            }
            }

    static void main(String[] args) {
        ll list = new ll();
        list.insertFirst(3);
        list.insertFirst(14);
        list.insertFirst(9);
        list.insertFirst(1);
        list.insertLast(45);
         list.insert(8,2);
         list.delete(4);
        System.out.println( "deleted value: " +list.delete(4));

        list.display();

    }
        }
