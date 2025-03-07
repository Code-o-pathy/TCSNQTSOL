//print the nth node from end of a linked list
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int x) {
        this.data = x;
        this.next = null;
    }
}

public class qn11 {
    public static void main(String args[]) {
        Node head = new Node(10);
        head.next = new Node(11);
        head.next.next = new Node(12);
        head.next.next.next = new Node(13);
        head.next.next.next.next = new Node(14);
        head.next.next.next.next.next = new Node(15);
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n between 1 to 6: ");
        int n=sc.nextInt();
        recur(head,n);    
    }
    public static void recur(Node head,int n){
        int length=0;
        Node curr=head;
        while(curr!=null){
            length++;
            curr=curr.next;
        }
        int ind=0;
        curr=head;
        while(n!=length-ind){
            curr=curr.next;
            ind++;
        }
        System.out.println(curr.data);


    }
}
