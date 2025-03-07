//middle of a linked list;
class Node{
    int data;
    Node next;
    Node(int x){
        this.data=x;
        this.next=null;
    }
}
public class qn4 {
    public static void main(String args[]){
        Node head=new Node(10);
        head.next=new Node(11);
        head.next.next=new Node(12);
        head.next.next.next=new Node(13);
        head.next.next.next.next=new Node(14);
        head.next.next.next.next.next=new Node(15);
        // head.next.next.next.next.next.next=new Node(16);
        Node curr=middleElem(head);
        System.out.println(curr.data);
    }
    public static Node middleElem(Node head){
        if(head==null || head.next==null || head.next.next==null){
            return head;
        }
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

    }

    
}


//qn3 is already done in string based section;
//qn5 is already done in array based section
