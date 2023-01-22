// In this approach, we will be using four loops to print all four sides of the matrix.
// 1st loop: This will print the elements from left to right.
// 2nd loop: This will print the elements from top to bottom.
// 3rd loop: This will print the elements from right to left.
// 4th loop: This will print the elements from bottom to top.

public class SpiralMatrixTraversal {
    static void printSpiral(int mat[][], int R, int C) {
        int top = 0, left = 0, bottom = R - 1, right = C - 1;
    
        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++)
                System.out.print(mat[top][i] + " ");
    
            top++;
    
            for (int i = top; i <= bottom; i++)
                System.out.print(mat[i][right] + " ");
    
            right--;
    
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                System.out.print(mat[bottom][i] + " ");
        
                bottom--;
            }
    
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                System.out.print(mat[i][left] + " ");
        
                left++;
            }
        }
      }
    
      public static void main(String args[]) {
        int arr[][] = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {13, 14, 15, 16}};
    
        printSpiral(arr, 4, 4);
    
      }
}
// Time Complexity: O(R x C)