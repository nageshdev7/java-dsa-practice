import java.util.Scanner;


public class Arrays4 {

    public static boolean isSorted(int[]a){
        for(int i =1;i<=a.length-1;i++){
            if(a[i]<=a[i-1]){
                return false;
            }     
        }
        return true;
}

    

    public static void main(String[] args) {

            Scanner sc =new Scanner(System.in);
            System.out.print("Enter the size of an Array : ");
            int size =sc.nextInt();
            int[] a= new int[size];
            System.out.print("Enter "+size+"Elements  in  an Array : ");
            for(int i=0;i<size;i++){
                a[i]=sc.nextInt();
                System.out.println();
            }

            if(isSorted(a))              System.out.println("Array is sorted");

            else              System.out.println("Array is not sorted");
        
        sc.close();
    }
}
    


    

