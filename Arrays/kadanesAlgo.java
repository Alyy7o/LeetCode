public class kadanesAlgo {
    public static void main(String[] args) {
        
        int[] arr = {3,-4,5,4,-1,7,-8};
        // int[] arr = {-3,-4,-5,-4,-1,-7,-8};
        int len = arr.length;
        
    // Sub-Array Time: O(n^3)
        // for(int st=0; st<len; st++){
        //     for(int end=st; end<len; end++){
        //         for(int i=st; i<=end; i++){
        //             System.out.print(arr[i]);
        //         }
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }

    // Brut Force Approach Time: O(n^2)
        // int maxSum = Integer.MIN_VALUE;
        // for(int st=0; st<len; st++){
        //     int sum = 0;
        //     for(int end=st; end<len; end++){
        //         sum += arr[end];
        //         maxSum = Math.max(sum, maxSum);
        //     }
        // }
        // System.out.println(maxSum);

    // Kadane's Algo Time: O(n)
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i=0; i<len; i++){
            currentSum += arr[i];
            maxSum = Math.max(maxSum, currentSum);

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        System.out.println(maxSum);


    }
}
