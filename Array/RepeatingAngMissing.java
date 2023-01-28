import java.util.ArrayList;

public class RepeatingAngMissing {

    //Approach - 1

    // Since the numbers are from 1 to N in the array arr[]

    // Take a substitute array of size N+1 and initalize it with 0.
    // Traverse the given array and increase the value of substitute[arr[i]] by one .
    // Then again traverse the substitute array starting from index 1 to N.
    // If you find any index value greater than 1 that is repeating element A.
    // If you find any index value = 0 then that is the missing element B.

    //====================================================================================

    //Approach -- 2
    // Sum of all elements from 1 to N:
    // S = N*(N+1)/2 ---- equation 1
    // And, Sum of squares of all elements from 1 to N:
    // P = N(N+1)(2N+1)/6. ----- equation 2
    
    // Similarly, find the sum of all elements of the array and sum of squares of all elements of the array respectively.

    // s1 = Sum of all elements of the array. —– equation 3
    // P1 = Sum of squares of all elements of the array. ——– equation 4

    // Now, if we subtract the sum of all elements of array from sum of all elements from 1 to N, 
    // that should give us the value for (X – Y).

    // Therefore,

    // (X-Y) = s – s1 = s’
    // X^2 – Y^2 = P – P1 = P’
    // or, (X + Y)(X – Y) = P’
    // or, (X + Y)*s’ = P’
    // or, X + Y = P’/s’
    // Great,
    // we have the two equations we needed:
    // (X – Y) = s’
    // (X + Y) = P’/s’
    // We can use the two equations to solve and find values for X and Y respectively.
    public static void main(String[] args) {
        int[] arr ={3,1,2,5,3};
        int n = arr.length;

        Integer S= (n*(n+1))/2;
        Integer p= (n*(n+1)*(2*n+1))/6;

        Integer missingNumber=0, repeatingNumber=0;

        for(int i=0;i<n;i++){
            S-=(Integer)arr[i];
            p-=(Integer) arr[i]*(Integer)arr[i];

        }

        missingNumber = (S+p/S)/2;
        repeatingNumber= missingNumber-S;

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(repeatingNumber);
        ans.add(missingNumber);

        System.out.println( ans);
    }
}
// time complexity -- O(N)
// space comlexity -- O(1)
