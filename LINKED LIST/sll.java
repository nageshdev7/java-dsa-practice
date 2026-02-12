class Node{
    int data;
    Node next;

 Node(int data){
    this.data =data;
    this.next =null;
    }
}


class list{
    Node head;
         public void addatEnd(int d){
                     Node newNode = new  Node(d);
                 if(head ==null){
                       head =newNode;
                        return;
    }
     Node Current = head;
     while(Current.next!= null)
           Current =Current.next;
    
    Current.next =newNode;
    }

    public void addAtStart(int d){
        Node newNode =new Node(d);
         if(head ==null){ 
            head =newNode; 
            return;
         }
        
         newNode.next =head;
         head =newNode;
    }

    public void display(){
        Node Current=head;

        while(Current!=null){
            System.out.print(Current.data+ "-> ");
            Current=Current.next;
        }
        System.out.println("Null");

    }
    public void addatPos(int d,int p){
        Node newNode =new Node(d);
        if(p==1) {
            newNode.next =head;
            head =newNode;
            return;
        }
        Node Current = head;
        int Count =1;
        while(Count < p-1 && Current.next !=null){
            Current =Current.next;
            Count++;
        }
        newNode.next =Current.next;
        Current.next =newNode;
    }
    
    public void delAtStart(){
        if(head == null || head.next ==null) {
 head = null;
 return;}
        
      head =head.next;
    }

    public void delatLast(){
        if(head == null || head.next ==null) {
       head = null;
       return;
        }
 Node Current=head;
    while(Current.next.next!=null){
      Current=Current.next;
        }
    Current.next=null;

    }

    public void delatPos(int p){

        if(p==1){
            head =head.next;
        }
        Node Current =head;
        int Count=1;
        while(Count<p-1&& Current.next!=null){
            Current =Current.next;
                        }
        Current.next=Current.next.next;


    }            




}

public class sll {
    public static void main(String args[]){
        list l = new list();
        l.addatEnd(1);
        l.addatEnd(20);
        l.addAtStart(30);
        l.addAtStart(40);
        l.addAtStart(50);
        l.addatPos(29,2 );
        l.display();
        l.delAtStart();
                l.display();
                l.delatLast();
                l.display();
                l.delatPos(3);
                l.display();

        



    }
    
}
