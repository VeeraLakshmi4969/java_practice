import java.util.*;
import java.util.LinkedList;

public class DFS {
    public static void main(String[] args) {
        int v = 4;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < v; i++)
            graph.add(new ArrayList<>());
        
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(0);
        graph.get(1).add(3);
        graph.get(2).add(0);
        graph.get(2).add(3);
        graph.get(3).add(1);
        graph.get(3).add(2);
        
        System.out.println("Graph Adjacency List: " + graph);
        
        System.out.print("BFS Traversal: ");
        bfs(graph, v);
        System.out.println(); // For clean output spacing
        
        System.out.print("DFS Traversal: ");
        boolean arr[] = new boolean[v];
        dfs(0, arr, graph);
        System.out.println();
    }

    public static void bfs(ArrayList<ArrayList<Integer>> graph, int v) {
        boolean visited[] = new boolean[v];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        visited[0] = true;
        
        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");
            for (int neighbour : graph.get(node)) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    queue.offer(neighbour);
                }
            }
        }
    } // <-- Added this missing closing brace to fix the nested method error

    // Added 'public' to match your bfs method style
    public static void dfs(int node, boolean visited[], ArrayList<ArrayList<Integer>> graph) {
        visited[node] = true;
        System.out.print(node + " ");
        for (int neighbour : graph.get(node)) {
            if (!visited[neighbour]) { // <-- Fixed the spelling typo here
                dfs(neighbour, visited, graph);
            }
        }
    }
}

