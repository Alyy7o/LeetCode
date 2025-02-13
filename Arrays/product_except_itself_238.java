
import java.util.Arrays;

class product_except_itself_238{

    public static  int[] productExceptSelf(int[] nums) { //O(n)
        int n = nums.length;
        int[] ans = new int[nums.length];
        Arrays.fill(ans,1);
        int[] prefix = new int[nums.length];
        Arrays.fill(prefix,1);
        int[] suffix = new int[nums.length];
        Arrays.fill(suffix,1);

       // prefix
        for(int i=1; i<n; i++){
           prefix[i] = prefix[i-1] * nums[i-1];
        }

       for(int i=n-2; i>=0; i--){                        
           suffix[i] = suffix[i+1] * nums[i+1];
       }

       for(int i=0; i<n; i++){
           ans[i] = prefix[i] * suffix[i];
       }

        return ans;
   }

    public static void main(String[] args) {
        int nums[] = {1,2,4,6};

        // O(n*2)
        int ans[] = new int[nums.length];

        for (int i = 0; i <nums.length; i++) {
            int no = 1;
            for(int j = 0; j<nums.length; j++){
                if(j != i){
                    no = nums[j] * no;
                }
            }
            ans[i] = no;
        }
        System.out.println(Arrays.toString(ans));
    }
}