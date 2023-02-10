package BinarySearch;

public class MinimumInRotatedSortedArray {
    public static void main(String[] args) {
        //int[] arr={4,5,6,7,0,1,2,3};
        int[] arr={4,5,1,2,3};
        int n=arr.length;

        int minVal=Integer.MAX_VALUE;
        int low=0,high=n-1;

        while(low<=high){
            if(arr[low]<arr[high]){
                minVal=Math.min(minVal,arr[low]);
                break;
            }
            int mid=(low+high)/2;

            if(arr[low]<=arr[mid]){
                minVal=Math.min(minVal,arr[low]);
                low=mid+1;

            }
            else{
                minVal=Math.min(minVal,arr[mid]);
                high=mid-1;
            }
        }
        System.out.println(minVal);
        
    }

    
}


