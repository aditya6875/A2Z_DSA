package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;



public class CycleDetectionUndirectedBFS {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<4;i++){
            adj.add(new ArrayList<>());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);

        boolean ans= isCycle(3,adj);
        if(ans){
            System.out.println("Cycle detected");

        }
        else{
            System.out.println("Cycle not detected");
        }
    }

    private static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean [] vis= new boolean[V];
        Arrays.fill(vis, false);
        int [] par= new int[V];
        Arrays.fill(par, -1);

        for(int i=0;i<V;i++){
            if(vis[i]==false){
                if(checkForCycle(adj,V,vis,par));
                    return true;
            }
        }

        return false;
    }

    private static boolean checkForCycle(ArrayList<ArrayList<Integer>> adj, int v, boolean[] vis, int[] par) {
        
        vis[v]=true;
        Queue<Node> q= new LinkedList<>();
        q.add(new Node(v,-1));

        while(!q.isEmpty()){
            int node=q.peek().first;
            int parent=q.peek().second;
            q.remove();

            for(Integer it:adj.get(node)){
                if(vis[it]==false){
                    q.add(new Node(it,node));
                    vis[it]=true;
                }
                else if(parent!=it)
                    return true;
            }


        }
        return false;
    }
}
class Node{
    int first;
    int second;

    public Node(int first,int second){
        this.first=first;
        this.second=second;
    }
}
