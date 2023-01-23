package Graph;

import java.util.ArrayList;

public class DFS {


    private static void dfstraversal(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> dfs) {
        vis[node]=true;
        dfs.add(node);

        for(Integer it:adj.get(node)){
            if(vis[it]==false){
                dfstraversal(it, vis, adj, dfs);
            }
        }


    }



    private static ArrayList<Integer> dfsofGraph(int V, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> dfs) {
        boolean[] vis= new boolean[V+1];
        vis[0]=true;
        dfstraversal(0,vis,adj,dfs);
        return dfs;
        
        
    }

    
    public static void main(String[] args) {
        int n=5;
        ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(2).add(4);
        adj.get(4).add(2);


        ArrayList<Integer> dfs = new ArrayList<Integer>();
        dfs= dfsofGraph(n,adj,dfs);
        System.out.println(dfs);
    }
}

// time complexity -- O(N)+ O(2E)
// space complexity -- O(3N) = O(N)

