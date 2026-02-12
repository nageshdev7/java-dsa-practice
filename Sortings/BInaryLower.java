public class BInaryLower {
    
    

    
    public static void main(String[] args) {
        int a[] ={1,2,3,4,4,4,4,4,4,4,4,4,7,44,55,77};
        int target=4;
        int n=a.length;

        int low =0;
        int high=n-1;

        int temp=-1;
        
        
        while(low<=high){
            int mid =low+(high-low)/2;
            if(a[mid]==target){
                temp=mid;
                high=mid-1;
            }
            else if(a[mid]>target){
                high=mid-1;
            }
            else if(a[mid]<target){
                low=mid+1;
            }
           
        }

           System.out.println(temp);
        
    }
    
}



