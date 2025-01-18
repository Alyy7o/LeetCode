class MaxConsecutiveOnes_III {
    public static int longestOnes(int[] arr, int k) { // O(n)
        int l = 0, r = 0, maxLen = Integer.MIN_VALUE, zero = 0;

        while (r < arr.length) {
            if (arr[r] == 0) {
                zero++;
            }
            while (l < r && zero > k) {
                if (arr[l] == 0) {
                    zero--;
                }
                l++;
            }
            if (zero <= k) {
                maxLen = Math.max(maxLen, r - l + 1);
            }
            r++;
        }

        if (maxLen == Integer.MIN_VALUE)
            return 0;

        return maxLen;
    }
}