public class MajorityElement {
    public static void main(String[] args) {
        int[] arr={2,2,1,1,1,2,2};
        int n=arr.length;

        //when we traverse through the array we try to keep track 
    //     of the count of elements and which element we are tracking. 
    //     Since the majority element appears more than N/2 times, 
    //     we can say that at some point in array traversal 
    //     we find the majority element. 

        int count=0;
        int element=0;

        for(int i=0;i<n;i++){
            if(count==0) element=arr[i];
            if(arr[i]==element) count+=1;
            else count--;
        }
        System.out.println(element);
    
    }
}
// time complexity -- O(N)
// space complexity-- O(1)
