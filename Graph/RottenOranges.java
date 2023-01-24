package Graph;

import java.util.LinkedList;
import java.util.Queue;
class Pair {
    int row;
    int col;
    int time;
    
    Pair(int _row, int _col, int _time) {
      this.row = _row;
      this.col = _col;
      this.time = _time;
    }
}

public class RottenOranges {
    static int orangesRotting(int[][] grid){
        int n= grid.length;
        int m=grid[0].length;

        Queue<Pair> q= new LinkedList<>();
        int[][] vis = new int[n][m];

        int countFresh=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                    vis[i][j]=2;
                }
                else{
                    vis[i][j]=0;
                }

                if(grid[i][j]==1){
                    countFresh++;
                }
            }
        }

        int time=0;
        int[] dr={-1,0,1,0};
        int[] dc={0,1,0,-1};
        int count=0;

        while(!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;
            int t=q.peek().time;
            time=Math.max(time,t);
            q.remove();

            for(int i=0;i<4;i++){
                int nr=r+dr[i];
                int nc=c+dc[i];

                if(nr>=0 && nr<n && nc>=0 && nc<m && vis[nr][nc]==0 && grid[nr][nc]==1){
                    vis[nr][nc]=2;
                    q.add(new Pair(nr,nc,t+1));
                    count++;
                }
            }
        }
        if(count!=countFresh) return -1;
        return time;

    }
    public static void main(String[] args) {
        int[][] grid =  {{0,1,2},{0,1,2},{2,1,1}};
        int ans= orangesRotting(grid);
        System.out.println(ans);
    }
}

// time complexity --O(N*M + N*M*4) == O(NM)

// For the worst case, all of the cells will have fresh oranges, 
// so the BFS function will be called for (N x M) nodes and for every node, 
// we are traversing for 4 neighbours, it will take O(N x M x 4) time.

// space complexity --O(NM)