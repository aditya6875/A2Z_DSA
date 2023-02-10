package BinarySearch;

public class SearchInRotatedDulicates {
    public static void main(String[] args) {
        int[] arr = { 3, 3, 1, 2, 3, 3 };
        int n = arr.length;
 
        int key = 3;
        System.out.println(search(arr, 0, n - 1, key));
    }

    private static int search(int[] arr, int low, int high, int key) {
        while(low<=high){
            int mid=(low+high)/2 ;
            if(arr[mid]==key) return mid;

            if(arr[mid]==arr[low] && arr[mid]==arr[high]){
                low++;
                high--;
                continue;
            }
            if(arr[low]<=arr[mid]){
                if(key>=arr[low] && key<arr[mid]) high=mid-1;
                else low=mid+1;
            }
            else{
                if(key<=arr[high] && key>arr[mid]) low=mid+1;
                else high=mid-1;
            }
        }
        return -1;
    }
}
