import java.util.ArrayList;

public class LeaderInAnArray {
    public static void main(String[] args) {
        //int[] arr={10,22,12,3,0,6};
        int[] arr={4, 7, 1, 0};
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int curr=arr[n-1];
        ans.add(curr);
        for(int i=n-2;i>-1;i--){
            if(curr<arr[i]){
                curr=arr[i];
                ans.add(curr);
            }



        }
        System.out.println(ans);

    }
    
}
// time complexity -- O(N)
// space compelxity -- O(1)
