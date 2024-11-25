public class containerWithMostWater {
    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

        int area = Integer.MIN_VALUE;
        int width = 0;
        int min_height = 0;

        // Brute Force Time: O(n^2)
        // for(int i=0; i<height.length; i++){
        // for(int j=i+1; j<height.length; j++){
        // width = j - i;
        // min_height = Math.min(height[i], height[j]);

        // if(width * min_height > area){
        // area = width * min_height;

        // }
        // }
        // }

        // Two Pointers Time: O(n)
        int max_water = 0;
        int i = 0, j = height.length-1;
        while (i < j) {
            width = j - i;
            min_height = Math.min(height[i], height[j]);
            area = width * min_height;
            max_water = Math.max(max_water, area);

            if (height[i] < height[j]) {

                i++;
            } else {

                j--;
            }
        }

        System.out.println(max_water);
    }
}
