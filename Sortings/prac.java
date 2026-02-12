import java.util.*;
public class prac {
    public static void main(String args[]){
        int a[] ={1,2,7,3,4,5,2,3,3,1,1,1,1,1,1,1,1};
        int target=7;
        int sum=0;
        int maxlen =0;
       

        int left =0,right =0;
        while(left<a.length&&right<a.length){
            sum+=a[right];
        
            if(sum==target){
              maxlen= Math.max(right-left+1,maxlen);
            }
            else if(sum>target){

                left++;
                right =left;
                sum=0;
            }else  right++;      

        }
        System.out.println(maxlen);
        
        
        
    }
}


//    HashMap<Integer,Integer> map =new HashMap<>();
//    for(int i = 0;i<a.length;i++){
//     sum+=a[i];
//     if(sum==target){
//         maxlen=i+1;
//     }
//     int rem =sum-target;
//     if(map.containsKey(rem)){
//         maxlen=Math.max(maxlen,i-map.get(rem));
//     }
//     if(!map.containsKey(rem)){
//         map.put(sum,i);
//     }
//    }
//    System.out.println(maxlen);