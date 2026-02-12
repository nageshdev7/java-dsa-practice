public class Insetion {

    

    public static void  swap(int a[],int i,int j){
      
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
        
    }

    public static void main(String[] args) {
        int a[] ={5,4,2,2,2,2,2,1};
        int n=a.length;
        
        for(int i=1;i<n;i++){
            int  j=i;
            while(j>0 &&a[j]<a[j-1]){
                swap(a, j, j-1);
                j--;
            }
           
        }
            for(int num: a) {
                
                System.out.print(num+ " ");
            }
            
            
        }
    }
        










        