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
        list.display();

    }
        }
