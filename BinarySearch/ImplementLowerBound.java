package BinarySearch;

public class ImplementLowerBound {
    private static int lowerbound(int[] arr, int n,int k){
        int low=0,high=n-1;
        if(high==0) return -1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==k)
                return mid;
            else if(arr[mid]>k) high= mid-1;
            else low=mid+1;
        }
        return high;
    }
    public static void main(String[] args) {
        int[] arr={1,2,8,10,11,12,19};
        int n=arr.length;
        int k= 5;

        int ans=lowerbound(arr,n,k);
        System.out.println(ans);
    }
}
// time complexity -- O(logN)
// space complexity -- O(1)


