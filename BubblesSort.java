
    import java.util.Scanner;
public class BubblesSort{
    public static void bubblesSort(int arr[]){

       int n =arr.length;

        for (int i=0;i<n-1 ;i++){

            

            for(int j=0;j<n-i-1;j++){


                if(arr[j]>arr[j+1]){
                    

                
            
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }
            }


            
        }


    }
    public static void printArray(int []arr)
    {
        for (int num : arr){
        
            System.out.print(num +",");
        
        }
    
        System.out.println();
    }
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

System.out.println("Enter the number arrays :");
//Scanner scanner =new Scanner(System.in);
 int n = scanner.nextInt();
  
 int []arr=new int[n];
       System.out.println("Enter the Elements of the array");
       for (int i=0;i<n ;i++){
        arr[i]= scanner.nextInt();
       }
        //int arr[]={77,88,99,0,6,3};
        System.out.println("Elements before sorting :  ");
        printArray(arr);

        bubblesSort(arr);
        System.out.println("Elements after sorting : ");
        printArray(arr);

scanner.close();
        
    }
    
}

