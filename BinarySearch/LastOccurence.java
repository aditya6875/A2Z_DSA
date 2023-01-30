package BinarySearch;



public class LastOccurence {
    public static void main(String[] args) {
        int[] arr = {3,4,13,13,13,20,40};
        int n = arr.length;
        int key = 13;
        
        System.out.println(solve(n, key, arr));
    }

    private static int solve(int n, int key, int[] arr) {
        int low=0;
        int high=n-1;
        int res=-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key){
                res=mid;
                low=mid+1;
            }
            else if(arr[mid]>key) high=mid-1;
            else low=mid+1;
        }
        return res;
    }
}
