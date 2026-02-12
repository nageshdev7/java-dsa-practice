public class BinaryFS{

    
    public static void main(String[] args) {
        int a[] ={1,2,3,4,4,4,4,4,4,4,4,4,7,44,55,77};
        int target=4;
        int n=a.length;

        int temp1=-1;
        int temp2 =-1;
        
        
        int low =0;
        int high=n-1;
        while(low<=high){
            int mid =low+(high-low)/2;
            if(a[mid]==target){
                temp1=mid;
                high=mid-1;
            }
            else if(a[mid]>target){
                high=mid-1;
            }
            else if(a[mid]<target){
                low=mid+1;
            }
           
        }
        
         low =0;
         high=n-1;
        while(low<=high){
            int mid =low+(high-low)/2;
            if(a[mid]==target){
                temp2=mid;
                low=mid+1;
            }
            else if(a[mid]>target){
                high=mid-1;
            }
            else if(a[mid]<target){
                low=mid+1;
            }
           
        }
           System.out.println("Floor "+a[temp1-1]);
           System.out.println("Seil " +a[temp2+1]);
        
    }
    
}
