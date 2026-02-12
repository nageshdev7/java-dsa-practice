class Node{
    int data;
    Node next;
    Node(int data){
        this.data =data;
        next=null;
    }
}
class List{
    Node head;

    public int helper(Node head){
        if(head==null)  return 1;

       int carry =helper(head.next);
        head.data =head.data+carry;
        if(head.data<10)  return 0;

        head.data=0;
        return 1;
         
    }


    public void addr(){

        int carry = helper(head);
        if(carry==1){
            Node newNode =new Node(1);
            newNode.next =head;
            head=newNode;
        }


    }

    public void  add(){
          
        if(head.next!= null) head=reverse(head);

        Node first = head;
        int carry =1;
        while(first!=null && carry ==1 ){
            int res =(first.data+carry)%10;
            if(first.data+1 <10) carry=0;
            first.data=res;
            first=first.next;
        }
        head=reverse(head);
        if(carry==1){
            Node newNode =new Node(1);
            newNode.next =head;
            head=newNode;
        }
        print();
    }
    public Node reverse(Node head){
        if(head==null || head.next == null) return head;

        Node newHead =reverse(head.next);
        head.next.next =head;
        head.next =null;
        return newHead;
    }
    
    public void print(){
      Node Curr =head;
      while(Curr!=null){
        System.out.print(Curr.data +" -> ");
        Curr =Curr.next;
      }
      System.out.println("null");
    }
}



public class add1 {
    public static void main(String args[]){
        List l =new List();

        Node head =new Node(9);
        head.next =new Node(9);
        head.next.next =new Node(9);
        head.next.next.next =new Node(9);
        l.head=head;
                l.print();

        l.addr();
        l.print();



    }
    
}
