public class Rotate90Matrix {
    static void rotation(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[0].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length/2;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[i][arr.length-1-j];
                arr[i][arr.length-1-j]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotation(arr);
        
        System.out.println("Rotated Image");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
// time complexity -- O(N*N) + O(N*N)
// space compelxity -- O(1).