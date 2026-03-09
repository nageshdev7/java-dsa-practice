import java.util.*;
class MatrixRepresentation{


    public static void  printGraph(int n,int[][] graph){
        for(int i=0;i<=n;i++){
            System.out.print(i+"--->");
            for(int j=0;j<=n;j++){
                if(graph[i][j]== 1){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int [][]  graph =new int[n+1][n+1];

       

        int edges =sc.nextInt();
         for(int i=0;i<edges;i++){
            int u =sc.nextInt();
            int v =sc.nextInt();

            graph[u][v] =1;
            graph[v][u] =1;
         }

    printGraph(n,graph);


    }
}