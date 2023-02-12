package BinarySearch;



public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 4, 4, 5, 5, 6, 6 };
 
        int element = search(arr);
 
        if (element != -1)
            System.out.println("The required element is "
                               + element);
        else
            System.out.println("There is no such element");
    }

    //Approach 1 -- linearly search

    // Approach 2 -- take xor=0 and run loop and then xor=xor^arr[i] and return xor 
    // a^a=0 and a^0=a

    // approach 3 is binary search and find occurence of the element in even and odd positions

    private static int search(int[] arr) {
        int low=0,high=arr.length-1,mid;
        if(arr.length==1){
            return arr[0];

        }
        // if first and second element not same return first
        if(arr[low]!=arr[low+1]) return arr[low];
        // if last and second last is not same return last
        if(arr[high]!=arr[high-1]) return arr[high];

        
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]) return arr[mid];

            else if((arr[mid]==arr[mid+1] && mid%2==0) || (arr[mid]==arr[mid-1] && mid%2!=0))
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;
    }
}
// time complexity -- O(log(n))
// space complexity -- O(1)
