public class MaximumProductSubarray {
    public static void main(String[] args) {
        int nums[] = {1,2,-3,0,-4,-5};
		int answer = maxProductSubArray(nums);
        int answer1 = maxProductSubArrayOptimised(nums);
        int answer2 = maxProductSubArrayBest(nums);
		System.out.print("The maximum product subarray is: "+answer);
        System.out.println();
		System.out.print("Optimised The maximum product subarray is: "+answer1);
        System.out.println();
        System.out.print(" BEST The maximum product subarray is: "+answer2);
    }

    

    private static int maxProductSubArray(int[] arr) {
        int result = Integer.MIN_VALUE;
	    for(int i=0;i<arr.length-1;i++) 
	        for(int j=i+1;j<arr.length;j++) {
	            int prod = 1;
	            for(int k=i;k<=j;k++) 
	                prod *= arr[k];
	            result = Math.max(result,prod);
	        }
	   return result; 
    }
    //Time Complexity: O(N3)
    //Reason: We are using 3 nested loops for finding all possible subarrays and their product.
    //Space Complexity: O(1)


    // Optimised Brute Force
    // Run a loop to find the start of the subarrays.
    // Run another nested loop
    // Multiply each element and store the maximum value of all the subarray.
    static int maxProductSubArrayOptimised(int arr[]) {
	    int result = arr[0];
	    for(int i=0;i<arr.length-1;i++) {
	        int p = arr[i];
	        for(int j=i+1;j<arr.length;j++) {
	            result = Math.max(result,p);
	            p *= arr[j];
	        }
	        result = Math.max(result,p);
	    }
	   return result;     
	}
    //Time Complexity: O(N2)


    // BEST APPROACH
    // Idea is to find the maximum product from both sides,i.e, 
    //once in a forwarding direction and another in the backward direction.
    private static int maxProductSubArrayBest(int[] arr) {
        int maxLeft = arr[0];
	    int maxRight = arr[0];
	    
	    boolean zeroPresent = false;
	    
	    int prod = 1;
	    
	    for(int i:arr) {
	        prod *= i;
	        if(i == 0) {
	            zeroPresent = true;
	            prod = 1;
	            continue;
	        }
	        maxLeft = Math.max(maxLeft,prod);
	    }
	    
	    prod = 1;
	    
	    for(int j=arr.length-1;j>=0;j--) {
	        prod *= arr[j];
	        if(arr[j] == 0) {
	            zeroPresent = true;
	            prod = 1;
	            continue;
	        }
	        maxRight = Math.max(maxRight,prod);
	    }
	    
	    if(zeroPresent) return Math.max(Math.max(maxLeft,maxRight),0);
	    return Math.max(maxLeft,maxRight);
        }

        // Time Complexity: O(N)

        // Reason: O(N) iteration two times for computing maximum product.

        // Space Complexity: O(1)

}
