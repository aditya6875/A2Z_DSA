package BinarySearch;

public class CountOccurencesSortedArray {
    public static void main(String[] args) {
        int[] arr = {2,2,3,3,3,3,4};
        int n=arr.length;
        int k=4;

        int ind= Binarysearch(arr,n,k);

        if(ind==-1){
            System.out.println(0);
        }

        int count=1;
        int left=ind-1;

        while(left>=0 && arr[left]==k){
            count++;
            left--;
        }

        int right=ind+1;
        while(right<n && arr[right]==k){
            count++;
            right++;
        }

        System.out.println(count);
    }

    private static int Binarysearch(int[] arr, int n, int k) {
        int low=0;
        int high =n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==k) return mid;
            else if(arr[mid]>k) high=mid-1;
            else low=mid+1;
        }
        return -1;
    }
}
