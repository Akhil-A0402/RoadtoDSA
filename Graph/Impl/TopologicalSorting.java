package Graph.Impl;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSorting {

    public static class Edge {
        int src,dest;

        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    // modified DFS
    public static void topologicalSortUtil(ArrayList<Edge> graph[], boolean[] vis, int curr, Stack<Integer> stack){
        vis[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                topologicalSortUtil(graph, vis, e.dest, stack);
            }
        }

        stack.push(curr);
    }

    public static void topologicalSort(ArrayList<Edge> graph[], int V){
        boolean visited[] = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<V;i++){
            if(!visited[i]){
                topologicalSortUtil(graph, visited, i, stack);
            }
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop() + ", ");
        }
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        topologicalSort(graph, V);
        
    }
}
