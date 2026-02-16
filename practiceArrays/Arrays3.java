import java.util.Scanner;
//import java.util.Arrays;

public class Arrays3 {
        public static void main(String[] args) {

            Scanner sc =new Scanner(System.in);
            System.out.print("Enter the size of an Array : ");
            int size =sc.nextInt();
            int[] arr1= new int[size];
            System.out.print("Enter "+size+"Elements  in  an Array : ");
            for(int i=0;i<size;i++){
                arr1[i]=sc.nextInt();
                System.out.println();
            }
/* 
Brute Approach
            Arrays.sort(arr1);
            int second =arr1[0];

            for(int i =arr1.length-2;i>=0;i--){

                if(arr1[i]!=arr1[size-1]){
                      second = arr1[i];
                      break;
                }

                */

                int largest= arr1[0];
                int second = -1;

             /*  
             Better Approah
             
             for(int i =0;i<arr1.length-1;i++){

                   

                    if(arr1[i]>largest){
                        largest = arr1[i];}
                }

               for(int i =0;i<arr1.length-1;i++){

                    if(arr1[i]>second && arr1[i]< largest){
                        second =arr1[i];
                    }
                }
                */

                for(int i=0;i<arr1.length-1;i++){
                    if(largest<arr1[i+1] ){
                        
                        second =largest;
                        largest =arr1[i+1];

                    }
                    else if (arr1[i]>second && arr1[i]!=largest){
                        second= arr1[i];

                    }
                }

                sc.close();
                System.out.println("the second largest element in the array is :"+second);
            }
         
            
        }
    
    
    
