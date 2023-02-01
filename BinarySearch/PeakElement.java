package BinarySearch;

public class PeakElement {

    public static int peakEleOptimal(int[] arr, int n) {
        int start = 0, end = n - 1;
    
        while (start < end) {
          int mid = (start + end) / 2;
    
          if (mid == 0)
            return arr[0] >= arr[1] ? arr[0] : arr[1];
    
          if (mid == n - 1)
            return arr[n - 1] >= arr[n - 2] ? arr[n - 1] : arr[n - 2];
    
          //Cheking whether peak ele is in mid position
          if (arr[mid] >= arr[mid - 1] && arr[mid] >= arr[mid + 1])
            return arr[mid];
    
          //If left ele is greater then ignore 2nd half of the elements
          if (arr[mid] < arr[mid - 1])
            end = mid - 1;
    
          //Else ignore first half of the elements
          else
            start = mid + 1;
        }
    
        return arr[start];
    
      }
    public static void main(String[] args) {
        int[] arr={2,6,3,7,8,9};
        int n=arr.length;

        // brute force approach
        //traverse the array and compare the neighbours
        for(int i=1;i<n-1;i++) {
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                System.out.println("Brute force approach solution is "+arr[i]);
                break;
            }

        }

        System.out.println("Optimised approach Peak Element is " + peakEleOptimal(arr, n));
    }
}
