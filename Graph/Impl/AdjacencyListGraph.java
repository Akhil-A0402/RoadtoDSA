package Graph.Impl;

import java.util.ArrayList;

public class AdjacencyListGraph {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }

        public Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }


    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));



    }

    public static void createGraphWeight(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,2, 2));
        graph[1].add(new Edge(1, 2, 10));
        graph[1].add(new Edge(1, 3, 0));
        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 1, 10));
        graph[2].add(new Edge(2, 3, -1));
        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 2, -1));



    }

    public static void main(String[] args) {
        int V = 4;
        
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);
        // print 2's neighbours

        for(int i=0;i<graph[2].size();i++) {
            Edge e = graph[2].get(i);
            System.out.print(e.dest + " ");
        }

        System.out.println();
        createGraphWeight(graph);

        
        for(int i=0;i<graph[2].size();i++) {
            Edge e = graph[2].get(i);
            System.out.print(e.dest+ "( " + e.wt + " )" + " ");
        }
    }
}
