public class BinarySeil{

    public static void main(String[] args) {
        int a[] ={1,23,3,3,3,7,44,55,77};
        int target=4;

       // int temp1=-1;
        int low =0;
        int high=a.length-1;
        while(low<=high){
            int mid =low+(high-low)/2;
            if(a[mid]==target){
                //temp1=mid;
                low=mid+1;
            }
            else if(a[mid]>target){
                high=mid-1;
            }
            else if(a[mid]<target){
                low=mid+1;
            }
           
        }
        
       
           System.out.println(low);
          
    }
    
}

    


    

