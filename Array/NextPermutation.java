import java.util.Arrays;

import java.util.Collections;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr= {1,2,3};
        int n=arr.length;
        int ind1=0;
        int ind2=0;
        for(int i=n-2;i>-1;i--){
            if(arr[i]<arr[i+1]){
                ind1=i;
                break;
            }
        }

        for(int j=n-1;j>-1;j++){
            if(arr[j]>arr[ind1]){
                ind2=j;
                break;
            }
        }

        if(ind1==0 && ind2==0){
            Collections.reverse(Arrays.asList(arr));
            return;
        }
        int temp=arr[ind1];
        arr[ind1]=arr[ind2];
        arr[ind2]=temp;

        int l=ind1+1;
        int h=n-1;
        while(l<h){
            int local=arr[l];
            arr[l]=arr[h];
            arr[h]=local;
            l+=1;
            h-=1;
        }

        Arrays.asList(arr);
        System.out.println("\n");
        for(int i=0;i<n;i++){

            System.out.println(arr[i]);

        }

    }

}

// time complexity -- O(N)
// space complexity -- O(1)
