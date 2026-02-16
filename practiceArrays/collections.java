import java.util.*;
class collections{
  public static void main(String[] args) {
    int arr[] ={0,1,2,3,4,6};
    Arrays.sort(arr);
    int s =arr[0];
    int e =arr[arr.length-1];
    for(int i=s;i<=e-1;i++){
      if(arr[i]!=i){
        System.out.println("missing number :"+i);

      }
    }

    for(int num : arr){
    System.out.print(num + " ");
    }
  }
}
