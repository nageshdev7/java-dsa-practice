class Node{
    int data;
    Node next;

    Node(int data){
        this.data =data;
        next =null;
    }
}
class List{
    Node head;

    public Node reverser(Node head){

        if(head ==null || head.next ==null) return head;

        Node newHead=reverser(head.next);
        Node front =head.next;
        front.next=head;
        head.next=null;
        return newHead;
       
    }
    
    public void reverse(){
        if(head ==null || head.next ==null) return ;
       
        Node prev =null;
        Node Curr=head;
        Node next;

        while(Curr!=null){
            next =Curr.next;
            Curr.next =prev;
            prev=Curr;
            Curr=next;

        }
        head=prev;
    }

    public void print(){
        Node Curr =head;
        while(Curr!=null){
            System.out.print(Curr.data +" -> ");
            Curr=Curr.next;
        }
        System.out.println("null");
    }
}



public class Reverse {
    public static void main(String args[]){
        List l=new List();

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        l.head = head; 
        l.print();
        l.reverse();
        l.print();
        l.reverser(l.head);
        l.print();
    }
    
}
