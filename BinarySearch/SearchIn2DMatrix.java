package BinarySearch;



public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][] grid={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=4;
        int n=grid.length ;
        int m=grid[0].length;

        int i=0;
        int j=m-1;
        boolean c=false;
        while(i<n && j>=0 ){
            if(grid[i][j]==target){
                c=true;
                
                break;
            }
                
            else if(grid[i][j]>target)
                j-=1;
            else
                i+=1;
        
        }
        if(c)
            System.out.println("Element is present");
        else
            System.out.println("Element is not present");
    


    }
}
