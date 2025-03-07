class Node {
    int data;
    Node next;

    Node(int x) {
        this.data = x;
        this.next = null;
    }
}

class qn6 {
    public static void print(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    public static void main(String args[]) {
        Node head=new Node(10);
        head.next=new Node(11);
        head.next.next=new Node(11);
        head.next.next.next=new Node(13);
        head.next.next.next.next=new Node(14);
        head.next.next.next.next.next=new Node(15);
        head.next.next.next.next.next.next=new Node(16);
        head.next.next.next.next.next.next.next=new Node(16);
        head.next.next.next.next.next.next.next.next=new Node(17);
        System.out.println("Before removing duplicates:");
        print(head);
        System.out.println("After removing duplicates:");
        //dont pass empty linked list or use a filter 
        
        //also the second parameter should not be the data of the head value.
        head=deleteDupli(head,(int)-1e7);
        print(head);
    }
    public static Node deleteDupli(Node head,int prevdata){
        if(head==null) return head;
        
        if(head.data==prevdata){
            return deleteDupli(head.next, prevdata);
        }
        else{
            head.next=deleteDupli(head.next, head.data);
        }
        return head;

    }
}


//qn7 kadanes already solved in TCS DIGITAL INTERVIEW