import java.util.Scanner;

public class Arrays1 {
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
          int min = arr1[0], max =arr1[0];
    
            for (int num : arr1){
    
                if (num>max) max=num;
                if(num<min)  min =num;
            }
         System.out.println("The maximum number in the array is : "+max);
            System.out.println("The minimum number in the array is : "+min);
     
            sc.close();;
            
        }
    }
    
    
