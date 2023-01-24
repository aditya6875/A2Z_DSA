import java.util.ArrayList;

public class MajorityElementN3 {
    public static void main(String[] args) {
        int[] arr ={1,2,2,3,2};
        int n=arr.length;

        // Extended Moore's vooting algorithm
        // num1 and num2 will store our most frequent and second most frequent element.
        // c1 and c2 will store their frequency reltively to other numbers.
        // if ele == num1, so we increment c1.
        // if ele == num2, so we increment c2.
        // if c1 is 0, so we assign num1 = ele.
        // if c2 is 0, so we assign num2 = ele.
        // In all the other cases we decrease both c1 and c2.

        int num1=-1, num2=-1, c1=0,c2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==num1) c1++;
            else if(arr[i]==num2) c2++;
            else if(c1==0){
                num1=arr[i];
                c1=1;
            }
            else if(c2==0){
                num2=arr[i];
                c2=1;
            }
            else{
                c1--;
                c2--;
            }
        }

        ArrayList<Integer> ans= new ArrayList<>();
        c1=0;
        c2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==num1) c1++;
            else if(arr[i]==num2) c2++;
        }
        if(c1>n/3) ans.add(num1);
        if(c2>n/3) ans.add(num2);

        System.out.println(ans);
    }
}
// time complexity -- O(N)
// space complexity -- O(1)

