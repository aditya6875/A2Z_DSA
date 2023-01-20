import java.util.HashMap;

public class SubarraySumDivisibleByK {
    public static void main(String[] args) {
        int[] arr={4,5,0,-2,-3,1};
        int k=5;

        // int [] arr= {5};
        // int k=9;

        int n=arr.length;
        
        HashMap<Integer, Integer> mp=new HashMap<>();
        mp.put(0,1);
        int rem=0;
        int sum=0;
        int ans=0;
        for(int i=0;i<n;i++) {
            sum+=arr[i];
            rem=sum%k;

            if(rem<0) rem+=k;
            if(mp.containsKey(rem)){
                ans+=mp.get(rem);
                mp.put(rem,mp.get(rem)+1);

            }
            else{
                mp.put(rem,1);
            }
        }
        System.out.println(ans);
    }
}
//TIME complexity -- O(N)
// SPACE complexity O(N)

