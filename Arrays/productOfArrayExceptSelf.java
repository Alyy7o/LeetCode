import java.util.Arrays;

public class productOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = {-1,1,0,-3,3};
        int[] ans = new int[arr.length];

        // Time: O(n^2)
        for(int i=0; i<arr.length; i++){
            int pro = 1;

            for(int j=0; j<arr.length; j++){
                if (i != j) {
                    
                    pro = pro * arr[j];
                }
            }
            ans[i] = pro;
        }

        System.out.println(Arrays.toString(ans));
    }
}
