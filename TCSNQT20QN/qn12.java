//detect loop in a linked list
//this algorithm is called floyd cycle detection algorithm.( i may be wrong)
class Node{
    int data;
    Node next;
    Node(int x){
        this.data=x;
        this.next=null;
    }
}
public class qn12 {
    public static void main(String args[]){
        Node head=new Node(10);
        head.next=new Node(11);
        head.next.next=new Node(12);
        head.next.next.next=new Node(13);
        head.next.next.next.next=new Node(14);
        head.next.next.next.next.next=new Node(15);
        head.next.next.next.next.next.next=new Node(16);
        head.next.next.next.next.next.next.next= head.next.next.next;
        boolean ans= isLoop(head);
        System.out.println(ans);
    }
    public static boolean isLoop(Node head){
        Node slow=head;
        Node fast=head;
        while(true){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==null || fast.next==null) return false;
            if(fast==slow) break;
        }
        slow=head;
        
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        System.out.println(slow.data+"  is the starting of the loop");
        return true;
    }
    
}


//qn 13 14 15 already solved in previous secitons.