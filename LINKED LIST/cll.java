class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
class Lis{
    Node head;
    Node tail;
   
    public void addAtStart(int d){
        Node newNode=new Node(d);

        if(head==null){
            head =newNode;
            tail =newNode;
            newNode.next=head;
            return;
        }
        newNode.next=head;
        tail.next=newNode;
        head=newNode;

    }
    public void display(){

        Node Curr =head;
        do{
            System.out.println(Curr.data + "->");
            Curr=Curr.next;
        }while(Curr!=head);
         System.out.print("null");
    }
    

}

public class cll{

    public static void main(String [] args) {
        Lis l=new Lis();
        l.addAtStart(30);
        l.addAtStart(30);
        l.addAtStart(20);
        l.addAtStart(10);
        l.display();
    }
    
}
