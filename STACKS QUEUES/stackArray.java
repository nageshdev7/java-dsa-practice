class stackArray{
    int top =-1;
    int[]  s=new int[10];
    public void push(int x){
        if(top>=10) System.out.println("cannot push");
        s[++top]=x;
    }
    public int  pop(){
        if(top==-1) {
            System.out.println("cannot pop");
        return -1;
    }
      return s[top--];
    }
    public void  peek(){
        if(top==-1)      System.out.println("No peek");
        System.out.println(s[top]);
    }
    public int size(){
        return top+1;
    }
    public void display(){
        for(int i=top;i>=0;i--){
            System.out.println("|"+s[i]+"|");
        }
    }

    public static void main(String args[]){
          stackArray st =new stackArray();
          st.push(20);
          st.push(21);
          st.push(22);
          st.push(23);
          st.push(24);
          st.push(25);
          st.push(26);
          st.push(27);
          st.display();
          st.peek();
          st.pop();
          st.peek();
         System.out.println(st.size());
          

    }
}