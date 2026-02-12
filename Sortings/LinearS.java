public class LinearS {
    public static void main(String[] args) {
        int a[] ={1,2,34,2,3,6,2,64,3,3235,2,4} ;
        int target=325;
        int n=a.length;
        
        for(int i=0;i<n;i++){
            if(a[i]==target){
                System.out.println(i);
                return;
            }
        }
        System.out.println("not found");
        
    }
    
}
