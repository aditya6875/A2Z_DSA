package BinarySearch;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2,3};
        int target=3;
        System.out.println("The index is: " + search(arr, target));
    }

    private static int search(int[] arr, int target) {
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==target) return mid;
            if(arr[low]<=arr[mid]){
                if(arr[low]<=target && arr[mid]>=target)
                    high=mid-1;
                else    
                    low=mid+1;
                
            }
            else{
                if(arr[mid]<=target && target<=arr[high])
                    low=mid+1;
                else  
                    high=mid-1;
            }

        }
        return -1;
    }
    
}
// time complexity -- O(log(N))
// space complexity -- O(1)