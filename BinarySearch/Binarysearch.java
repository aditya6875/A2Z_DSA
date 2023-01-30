package BinarySearch;



public class Binarysearch {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6,7};
        int n=arr.length;
        int key = 2;
        int ans= binarySearch(arr,n,key);
        System.out.println(ans);

    }

    private static int binarySearch(int[] arr, int n,int key) {
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key)
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;

    }
}
