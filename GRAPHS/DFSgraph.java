import java.util.*;
class DFSgraph{

    public static void dfs(int start,ArrayList<ArrayList<Integer>>  graph,boolean[] visited){


        visited[start]=true;
        System.out.print(start+ " ");

        for(int Node : graph.get(start)){
            if(!visited[Node])  dfs(Node,graph,visited);
        }
      

    }
    public static void main(String args[]){

     Scanner sc =new Scanner(System.in);
     
     int n =sc.nextInt();

     ArrayList<ArrayList<Integer>>  graph = new ArrayList<>();

     for(int i =0;i<n;i++){
        graph.add(new ArrayList<>());
     }
    
     int edges =sc.nextInt();

     for(int i=0;i<edges;i++){
        int u=sc.nextInt();
        int v=sc.nextInt();

        graph.get(u).add(v);
        graph.get(v).add(u);
     }

      boolean[] visited =new boolean[n];

    dfs(0,graph,visited);
    }
}
