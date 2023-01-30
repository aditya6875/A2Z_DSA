package BinarySearch;



public class SearchInsetPosition {
    public static void main(String[] args) {
        int[] arr={1, 3, 5, 6};
        int n=arr.length;
        int k=5;

        int low=0;
        int high=n-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==k){ 
            System.out.println(mid);
            break;
            }
            else if(arr[mid]>k) high=mid-1;
            else low=mid+1;

        }
        System.out.println(low);
    }
}
