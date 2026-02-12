public class queueArray{

    int end =-1,start=-1;
    int curr =0;
    int size=10;
    int[] Q =new int[size];



    public void push(int x){
        if(curr ==size) System.out.println("queue is full");
        if(curr==0){
            start++;
            end++;
        }else{
            end=(end+1)%size;
        }
        Q[end]=x;
        curr++;
    }
    public void pop(){
        if(curr==0) System.out.println("queue is Empty");
        int ele=Q[start];
        if(curr==1){
            start =-1;
            end =-1;
        }else{
            start=(start+1)%size;
        }
        System.out.println(ele);
        curr--;
    }
    public void peek(){
        System.out.println(Q[start]);
    }
    public void size(){
        System.out.print(curr);
    }
    

    public static void main(String args[]){

        queueArray q=new queueArray();
            q.push(21);
            q.push(22);
            q.push(23);
            q.push(24);
            q.push(25);
            q.push(26);
            q.push(27);

            q.pop();
            q.pop();
            q.pop();
            q.peek();
            q.size();


    }
    
}
