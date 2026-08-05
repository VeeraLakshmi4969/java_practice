import java.util.*;
import java.util.LinkedList;
public class BFS {
    public static void main(String[] args) {
        int v=4;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0; i<v;i++)
            graph.add(new ArrayList<>());
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(0);
        graph.get(1).add(3);
        graph.get(2).add(0);
        graph.get(2).add(3);
        graph.get(3).add(1);
        graph.get(3).add(2);
        System.out.println(graph);
    bfs(graph,v);
    }
    public static void bfs(ArrayList<ArrayList<Integer>> graph, int v){
boolean visited[] =new boolean[v];
Queue<Integer> queue = new LinkedList<>();
queue.offer(0);
visited[0] = true;
while(!queue.isEmpty()){
    int node  = queue.poll();
    System.out.print(node+ " ");
    for(int neightbour: graph.get(node)){
        if(!visited[neightbour]){
            visited[neightbour]=true;
            queue.offer(neightbour);
        }
    }
}

    }
}
