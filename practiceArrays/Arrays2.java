import java.util.Scanner;

public class Arrays2 {
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
            System.out.print("which element do you want  : ");
            int num =sc.nextInt();
                   int found=-1;

                   for(int i=0;i<arr1.length;i++){
                    if (num==arr1[i]) {  found =i;
                        break;
                    }  
                   }
            
            if(found==-1) System.out.println("the element is not found");
            else System.err.println("the element found at position "+ (found+1));




            sc.close();;
            
        }
    }
    
    

