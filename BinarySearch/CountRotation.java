package BinarySearch;

public class CountRotation {
    public static void main(String[] args) {
        int[] arr={5,1,2,3,4};
        int n=arr.length;

        int low=0,high=n-1;
        while(low<high){
            int mid=(low+high)/2;
            if(arr[mid]>arr[high])
                low=mid+1;
            else
                high=mid;

        }
        System.out.println("Number of Roation:"+low);
    
    }
}
