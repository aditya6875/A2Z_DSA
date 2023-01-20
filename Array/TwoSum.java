import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        // int [] arr= {2,7,11,15};
        // int target=9;
        
        int [] arr= {3,2,4,6};
        int target=6;
        ArrayList<Integer> res= new ArrayList<>();
        Arrays.sort(arr);
        int n=arr.length;
        int l=0;
        int h=n-1;
        while(l<h){
            if(arr[l]+arr[h]==target){
                res.add(l);
                res.add(h);
                break;
            }
            else if(arr[l]+arr[h]>target){
                h--;
            }
            else l++;

        }
        System.out.print("After sorting array is :");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(res);

    }
}
