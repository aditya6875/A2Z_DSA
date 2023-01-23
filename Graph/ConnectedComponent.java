package Graph;

import java.util.ArrayList;

public class ConnectedComponent {
    private static void dfs(int i, ArrayList<ArrayList<Integer>> adj,boolean[] vis){
        vis[i]=true;
        for(int it: adj.get(i)){
            if(!vis[it])
                dfs(it, adj, vis);

        }
    }

    static int connectedComponent(ArrayList<ArrayList<Integer>> adj, int n){
        boolean [] vis= new boolean[n+1];
        int count=0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(i,adj,vis);
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int n=5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Integer>());
        }
        adj.get(1).add(0);
        adj.get(0).add(1);
        adj.get(2).add(1);
        adj.get(1).add(2);
        adj.get(3).add(4);
        adj.get(4).add(3);

        int res= connectedComponent(adj,n);
        System.out.println(res);
    }
}
