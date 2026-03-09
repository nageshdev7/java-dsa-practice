
import java.util.*;
public class AdjacencyListRepre {


    public static void printGraph(int n,ArrayList<ArrayList<Integer>> graph){

        for(int i =0;i<n;i++){
            System.out.print(i+"-->");
            for(int j : graph.get(i)){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        
        ArrayList<ArrayList<Integer>> graph =new ArrayList<>();

        int n =sc.nextInt();
        
        for(int i=0;i<n;i++){
           graph.add(new ArrayList<>());
        }
        int edges =sc.nextInt();
        for(int i=0;i<edges;i++){
            int  u= sc.nextInt();
            int v =sc.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u);
        }
    

        printGraph(n,graph);
    }
    
}
