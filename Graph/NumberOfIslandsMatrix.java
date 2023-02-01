package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslandsMatrix {
    public static void main(String[] args) {
        int[][] grid={{1,0,1},{0,1,0},{1,0,1}};
        int count=0;
        int n=grid.length;
        int m=grid[0].length;

        boolean[][] vis= new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vis[i][j]){
                    count++;
                    bfs(i,j,grid,vis,n,m);
                }
            }
        }
        System.out.println(count);
    }
    private static void bfs(int r, int c, int[][] grid, boolean[][] vis, int n, int m) {
        vis[r][c]=true;
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(r,c));

        while(!q.isEmpty()){
            int row=q.peek().first;
            int col= q.peek().second;
            q.remove();

            for(int dr=-1; dr<=1;dr++){
                for(int dc=-1;dc<=1;dc++){
                    int nr= r+dr;
                    int nc= c+dc;

                    if(nr>0 && nr<n && nc>0 && nc<m && grid[nr][nc]==1 && vis[nr][nc]==false){
                        vis[nr][nc]=true;
                        q.add(new Pair(nr,nc));
                    }
                }
            }

        }

    }
}

class Pair{
    int first;
    int second;
    public Pair(int first,int second){
        this.first=first;
        this.second=second;
    }

}
