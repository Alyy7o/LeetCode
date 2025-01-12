import java.util.Arrays;
import java.util.HashSet;

public class RepeatAndMissingNo {
    public static int[] repeatedNumber(final int[] A) {
        HashSet<Integer> hash = new HashSet<>();
        int ans[] = {-1 , 1};

        for(int i=0; i<A.length; i++){
            if(hash.contains(A[i])){
                ans[0] = A[i];
            }
            hash.add(A[i]);
        }

        int min = Integer.MAX_VALUE;
        for(int i=0; i<A.length; i++){
            min = Math.min(min, A[i]);
        }
        for(int elm : hash){
            if(!hash.contains(min)){
                ans[1] = min;
            }
            min += 1;
            
        }

        return ans;
    }
    public static void main(String[] args) {
        // int nums[] = {3, 1, 2, 5, 3};
        int nums[] = {1,1};
        System.out.println(Arrays.toString(repeatedNumber(nums)));
    }
}
