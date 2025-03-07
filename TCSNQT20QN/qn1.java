//reverse a linked list
import java.util.*;
class Node{
    int value;
    Node next;
    Node(int x){
        this.value=x;
        this.next=null;
    }
}
class qn1{
    public static void print(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.value+" ");
            curr=curr.next;
        }
    }
    public static void main(String args[]){

        //singly linked list 10->11->12->13->14
        Node head=new Node(10);
        head.next=new Node(11);
        head.next.next=new Node(12);
        head.next.next.next=new Node(13);
        head.next.next.next.next=new Node(14);  
        System.out.println("Before reversing");
        print(head);
        head=reverse(head);
        System.out.println("After reversing");
        print(head);
    }
    public static Node reverse(Node head){
        //actual reversing function
        if(head==null || head.next==null){
            return head;
        }
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}