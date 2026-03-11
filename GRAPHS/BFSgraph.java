import java.util.*;
class BFSgraph{

    public static void bfs(int start,ArrayList<ArrayList<Integer>>  graph,boolean[] visited){

        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start]=true;

        while(!q.isEmpty()){
            int Node =q.poll();

            System.out.print(Node+ " ");
            for(int i:graph.get(Node)){
                if(!visited[i]){
                      q.add(i);
                      visited[i]=true;
                }
            }
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

    bfs(0,graph,visited);
    }
}
