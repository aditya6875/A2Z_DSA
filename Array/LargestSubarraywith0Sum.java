import java.util.HashMap;

public class LargestSubarraywith0Sum {
    
    // brute force approach
    //all possible subarrays of the given array and check for the subarrays that sum to zero. 
    //Among these valid subarrays (a sum equal to zero) 
    //we’ll return the length of the largest subarray by maintaining a variable, say max.   
    static int solvebruteforce(int[] arr, int n){
        int  max = 0;
        for(int i = 0; i < arr.length; ++i){
            int sum = 0;
            for(int j = i; j < arr.length; ++j){
                sum += arr[j];
                if(sum == 0){
                    max = Math.max(max, j-i+1);
                }
            }
        }
        return max; 
    }

    // optimise approach
    // So in this problem, we’ll store the prefix sum of every element, 
    // and if we observe that 2 elements have same prefix sum, 
    // we can conclude that the 2nd part of this subarray sums to zero


    static int solveoptimise(int[] arr, int n){
        int max=0;
        int sum=0;
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();

        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0) max= i+1;
            else{
                if(map.get(sum)!=null){
                    max=Math.max(max,i-map.get(sum));

                }
                else{
                    map.put(sum,i);
                }
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int [] arr= {9,-3,3,-1,6,-5};
        int n = arr.length; 

        int ans= solvebruteforce(arr,n);

        int res= solveoptimise(arr,n);

        System.out.println(res);

        // brute force answer below
        System.out.println(ans);
    }
}
