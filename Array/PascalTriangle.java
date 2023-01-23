import java.util.ArrayList;


public class PascalTriangle {
    public static void main(String[] args) {
        int numRows=5;
    //      1
    //     1 1
    //    1 2 1
    //   1 3 3 1
    //  1 4 6 4 1
    // it is populary a matrix problem
    // matrix[i][j] = matrix[i-1][j-1]+ matrix[i-1][j];

        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> row, pre = null;
        for (int i = 0; i < numRows; ++i) {
            row = new ArrayList<Integer>();
            for (int j = 0; j <= i; ++j)
                if (j == 0 || j == i)
                    row.add(1);
                else
                    row.add(pre.get(j - 1) + pre.get(j));
            pre = row;
            res.add(row);
        }
        System.out.println(res);
    }
}
// time complexity -- O(R*C
// space complexity -- O(R^2)
    

