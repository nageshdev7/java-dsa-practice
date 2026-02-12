class Node{
    int data ;
    Node next;

    Node(int data){
        this.data =data;
        this.next=null;
    }
}
class deleteHead{
    Node head;  

    void deleteValue(int X){
         
        if(head == null) return ;

        if(head.data == X) head =head.next;

        Node curr = head;

        while (curr.next!= null && curr.next.data!=X){
            curr=curr.next;
        }
        if(curr.next!=null){
            curr.next=curr.next.next;
        }
    }




    // void deletetail(){
    //     if(head ==null || head.next == null) return ;
    //      Node temp =head;

    //      while(temp.next.next != null){
    //         temp= temp.next;
    //      }
    //      temp.next =null;
    //      return;
    // }


    // void deletehea(){
    //     if(head == null){
    //         System.out.println("list is empty");
    //         return;
    //     }
    //     head=head.next;
    //  }
    //  void deleteK(int K){
    //     if(head == null){
    //         System.out.println("list is empty");
    //         return ;
    //     }
    //     if(K==1){
    //         head = head.next;
    //         return;
    //     }
    //     Node temp = head;
    //     for(int i = 1;i<K;i++){

    //         if(temp == null || temp.next == null){
    //             System.out.println("index Out of range");
    //          return; 
    //         }
    //         temp =temp.next;

    //         }

    //         if(temp.next == null){
    //             System.out.println("index out of range");
    //             return;
    //         }
    //         temp.next =temp.next.next;
    //     }

    void addatEnd(int  data){
        Node newNode = new Node(data);

        if(head ==null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode; 
    }
    void print(){
        Node temp =head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp =temp.next;
        }
        System.out.println("null");
    }
}





public class Delete{
    public static void main (String[] args){

        deleteHead list = new deleteHead();

        list.addatEnd(40);
        list.addatEnd(50);
        list.addatEnd(60);
        list.addatEnd(410);
        list.addatEnd(501);
        list.addatEnd(610);

        System.out.println("before deleting ");
        list.print();

        list.deleteValue(610);

        
        System.out.println("after deleting head ");
        list.print();
    
       
       

    }
}