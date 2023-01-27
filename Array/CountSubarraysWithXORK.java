import java.util.HashMap;

public class CountSubarraysWithXORK {

    private static int bruteForce(int[] arr, int k) {
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++) {
            int currXor=0;
            for(int j=i;j<n;j++) {
                currXor^=arr[j];
                if(currXor==k) count++;
            }
        }
        return count;
    }
    // time complexity -- O(n^2)
    // space complexity -- O(1)



    // The main idea is to observe the prefix xor of the array.
    // Prefix Xor is just another array, where each index contains XOR of all elements 
    // of the original array starting from index 0 up to that index. In other words
    private static int optimalAprroach(int[] arr, int k){
        int count=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        int CurrPrefixXor=0;
        int n=arr.length;

        for(int i=0;i<n;i++){
            CurrPrefixXor^=arr[i];
            if(map.get(CurrPrefixXor^k)!=null)
                count+=map.get(CurrPrefixXor^k);
            if(CurrPrefixXor==k) count++;

            if(map.get(CurrPrefixXor)!=null)
                map.put(CurrPrefixXor,map.get(CurrPrefixXor)+1);
            else
                map.put(CurrPrefixXor,1);
        }

        return count;

    }
    public static void main(String[] args) {
        int[] arr={4, 2, 2, 6, 4};
        int k=6;

        // brute force approach
        
        int res=bruteForce(arr,k);
        System.out.println("Brute force approach COUNT-- "+res);

        int ans=optimalAprroach(arr,k);
        System.out.println("Optimal approach COUNT--"+ ans);
    }
}
// Time Complexity: O(N)
// Space Complexity: O(N)

