import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {100,200,1,3,2,4};
        int n = arr.length;

        Set<Integer> hashSet= new HashSet<Integer>();

        for(int num:arr) hashSet.add(num);

        int longestStreak=0;
        for(int num:arr){
            if(!hashSet.contains(num-1)){
                int currNum= num;
                int currStreak=1;

                while(hashSet.contains(currNum+1)){
                    currNum++;
                    currStreak+=1;

                }

                longestStreak = Math.max(currStreak, longestStreak);
            }
        }

        System.out.println(longestStreak);


    }
}
// time complexity -- O(N)
// space complexity -- O(1)

