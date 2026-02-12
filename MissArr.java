import java.util.Scanner;

public class MissArr {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the n numbers : ");
     int n =sc.nextInt();
     int sum =(n*(n+1))/2;
     int actualsum =0;
     int[] a = new int[n];
     for(int i =0;i<n;i++){
        a[i]=sc.nextInt();
        actualsum+=a[i];
     }
     
     int Missing = -(sum-actualsum);
        System.out.println("Missing : " +Missing);
     sc.close();
    }

    
}
