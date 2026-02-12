public class Selction{
    public static void  swap(int a[],int i,int j){
      
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
        
    }

    public static void main(String[] args) {
        int a[] ={5,4,3,2,1};
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){

                     swap(a,j,j+1);
                    }
                }
            }
            for(int num: a) {
                
                System.out.print(num+ " ");
            }
            
            
        }
        










        // int temp = a[j];
        // a[j] = a[j+1];
        // a[j+1] = temp;
}
//     for(int i=0;i<a.length;i++){
//         int min =Integer.MAX_VALUE;
//         int index =i;
//         for(int j=i+1;j<a.length;j++){
//             if(a[j]<min){
//                 min=a[j];
//                 index =j;
//             }
//             a[i]=min;
//             a[index]=a[i];
//         }
//     }
//    for(int aa: a) {

//        System.out.print(aa + " ");
//    }