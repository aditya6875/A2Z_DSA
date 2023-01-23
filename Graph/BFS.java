package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public static ArrayList<Integer> bfsofGraph(ArrayList<ArrayList<Integer>> adj,int V, ArrayList<Integer> bfs){
        boolean[] vis= new boolean[V];
        Queue<Integer> q= new LinkedList<>();

        q.add(0);
        vis[0]=true;

        while(!q.isEmpty()){
            Integer node= q.poll();
            bfs.add(node);

            for(Integer it:adj.get(node)){
                if(vis[it]==false){
                    vis[it]=true;
                    q.add(it);
                }
            }
        }
        return bfs;
        
    }
    public static void main(String[] args) {
        int n=5;
        ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);


        ArrayList<Integer> bfs= new ArrayList<>();
        bfs= bfsofGraph(adj,n,bfs);
        System.out.println(bfs);
    }
}

// time coplexity -- O(N)+O(2E)
// Where N = Nodes, 2E is for total degrees as we traverse all adjacent nodes.
// Space complexity -- O(3N) = O(N) Queue+ vis+ adj list
