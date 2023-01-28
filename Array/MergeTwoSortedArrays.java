public class MergeTwoSortedArrays {

    private static void merge(int[] arr1, int arr2[], int n, int m) {
        int i, k;
        for (i = 0; i < n; i++) {
        // take first element from arr1 
        // compare it with first element of second array
        // if condition match, then swap
        if (arr1[i] > arr2[0]) {
            int temp = arr1[i];
            arr1[i] = arr2[0];
            arr2[0] = temp;
        }

        // then sort the second array
        // put the element in its correct position
        // so that next cycle can swap elements correctly
        int first = arr2[0];
        // insertion sort is used here
        for (k = 1; k < m && arr2[k] < first; k++) {
            arr2[k - 1] = arr2[k];
        }
        arr2[k - 1] = first;
        }

    }

    // time complexity -- O(nm)
    // space complexity -- O(1)

    // gap method optimised approach
    static void swap(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;
    }
    static void merge1(int ar1[], int ar2[], int n, int m) {
        // code here 
        int gap =(int) Math.ceil((double)(n + m) / 2.0);
        while (gap > 0) {
          int i = 0;
          int j = gap;
          while (j < (n + m)) {
            if (j < n && ar1[i] > ar1[j]) {
              swap(ar1[i], ar1[j]);
            } else if (j >= n && i < n && ar1[i] > ar2[j - n]) {
              swap(ar1[i], ar2[j - n]);
            } else if (j >= n && i >= n && ar2[i - n] > ar2[j - n]) {
              swap(ar2[i - n], ar2[j - n]);
            }
            j++;
            i++;
          }
          if (gap == 1) {
            gap = 0;
          } else {
            gap =(int) Math.ceil((double) gap / 2.0);
          }
        }
    }


    public static void main(String[] args) {
        int arr1[] = {1,4,7,8,10};
	    int arr2[] = {2,3,9};

        merge(arr1, arr2, arr1.length, arr2.length);
        System.out.println("After merge:");
        for (int i = 0; i < arr1.length; i++) {
        System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
        System.out.print(arr2[i] + " ");
        }
    }

    
}
