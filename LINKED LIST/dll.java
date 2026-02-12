class Nodes{
    Nodes prev;
    int data;
    Nodes next;
    Nodes(int data){
        prev =null;
        this.data=data;
        next=null;
    }

}


class list{
    Nodes head;
    Nodes tail;

    public void delatPos(int k){

        if(k==1){
            head=head.next;
            head.prev =null;
        }
        Nodes curr=head;
        int count =1;

        while(count<k-1){
            count++;
            curr=curr.next;
        }
        curr.next=curr.next.next;
        curr.next.next.prev=curr;


    }

    public void addAtStart(int n){
        Nodes newNode =new Nodes(n);

        if(head ==null){
            head=tail=newNode;
            return;
        }
        newNode.next =head;
        head.prev=newNode;
        head=newNode;

    }
    public void addatPossta(int n,int k){
        Nodes newNode =new Nodes(n);
        if(k==1){
            head.prev=newNode;
            newNode.next =head;
            head =newNode;
        }
        Nodes Current =head;
        int count =1;
        while(count<k-1 && Current.next != null){
            Current =Current.next;
            count++;
        }
       
        newNode.next=Current.next;
        Current.next=newNode;
        newNode.prev =Current;


    }

    public void deltail(){
        if(head== null || head.next == null){
            head =null;
            return;
        }
        tail =tail.prev;
       tail.next =null;

    }

   public void addAtEnd(int n){

    Nodes newNode =new Nodes(n);

  
        if(head ==null){
            head=tail=newNode;
            return;
        }
        newNode.prev =tail;
        tail.next=newNode;
        tail =newNode;

   }
    public void display(){
        Nodes Curr =head;
        while(Curr!=null){
            System.out.print(Curr.data+ " -> ");
            Curr=Curr.next;
        }
        System.out.println("null");
    }


    public void delhead(){
        if(head== null || head.next == null){
            head =null;
            return;
    }
       head =head.next;
       head.prev=null;



    }
    public void displayback(){
        Nodes Curr =tail;
        while (Curr!=null){
            System.out.print(Curr.data+" -> ");
            Curr=Curr.prev;
        }
        System.out.println("null");

    }

}

public class dll {
    
public static void main(String[] args) {
    list l =new list();
    l.addAtStart(10);   
    l.addAtStart(20);
    l.addAtStart(30);
    l.addAtStart(40);
    l.addAtStart(50);
    l.addAtStart(60);
    l.display();
    l.displayback();

    l.addAtEnd(70);
    l.display();
    l.displayback();

    l.addatPossta(90,4);
     l.display();

     l.delhead();
     l.display();

      l.deltail();
     l.display();

    
      l.delatPos(3);
     l.display();
    
}
    
}
