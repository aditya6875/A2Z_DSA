public class SubarrayWithGivenSum {
    static void bruteforceSolution(int[] arr,int n,int k){
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;i++){
                sum+=arr[j];
                if(sum==k){
                    for(int p=i;p<=j;p++){
                        System.out.print(arr[p]+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
    // Time complexity --O(N^2 +N)
    //Space complexity -- O(1)

    static void optimalSolution(int[] arr,int n,int k){
        int start=0,end=-1,sum=0;
        while(start<n){
            while((end+1<n) &&(sum+arr[end+1]<=k)){
                sum+=arr[++end];
            }
            if(sum==k){
                for(int p=start;p<=end;p++){
                    System.out.print(arr[p]+" ");
                }
                System.out.println();
            }
            sum-=arr[start];
            start++;
        }

    }
    // Time complexity -- O(N^2)
    // O(N) time to determine whether a subarray sum to k and
    // O(N) time to print each such subarray

    // Space complexity -- O(1)


    public static void main(String[] args) {
        int[] arr={2,1,3,4,5,6};
        int k=10;
        int n=arr.length;
        // Brute Force approach
        // Generate all possible subarrays, we need two nested loops.
        // first loop for deciding starting index and second loop for traversing
        // at each point we check whether we reached the required sum 

        //System.out.println("Brute force approach");
        //bruteforceSolution(arr,n,k);
        
        System.out.println("Optimal approach");
        optimalSolution(arr,n,k);
    }
}
