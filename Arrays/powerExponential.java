public class powerExponential {
    public static void main(String[] args) {
        
        double x = 2; // base value
        int n = -2; // power
        double ans = 1;

        // Time: O(n) It will give time limit exceed error as it takes more time tha 10^31
        // for(int i=0; i<n; i++){
        //     ans *= x;

        // }
        // System.out.println(ans);


        // Time: O(logn)
        if(n < 0){
            x = 1/x;
            n = -n;
        }

        while (n > 0) {
            if (n % 2 == 1) {
                ans *= x;
            }
            x *= x;
            n /= 2;
        }

        System.out.println(ans);
    }
}
