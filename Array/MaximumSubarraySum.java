import java.util.ArrayList;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int n=arr.length;
        int maxSofar=-99999;
        int maxSumEndindex=0;
        int start=0;
        ArrayList<Integer> subarray = new ArrayList<>();
        for(int i=0;i<n;i++){
            maxSumEndindex+=arr[i];
            if(maxSumEndindex>maxSofar){
                subarray.clear();
                maxSofar=maxSumEndindex;
                subarray.add(start);
                subarray.add(i);

            }
            if(maxSumEndindex<0){
                maxSumEndindex=0;
                start=i+1;
            }
        }
        System.out.println(maxSofar);
        System.out.println("The subarray is:");
        for(int i=subarray.get(0);i<=subarray.get(1);i++){
            System.out.print(arr[i]+" ");
        }


    }
}
