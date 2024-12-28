import java.util.*;

public class MajorityElement_II {
    public static List<Integer> majorityElement(int[] nums) {
        
        //Brute force T:O(n^2) S:O(1)
        
        // List<Integer> ans = new ArrayList<>();
        // for(int i=0; i<nums.length; i++){
        //     int frq = 0;
        //     for(int j=i; j<nums.length; j++){
        //         if(nums[j] == nums[i]) frq++;
        //         if(frq > nums.length/3 && !ans.contains(nums[i])){
        //             ans.add(nums[i]);
        //         }
        //     }
        // }
        // return ans;



        // By Hash Table T:O(n) S:O(n)

        // Create a frequency map to store the count of each element
        // Map<Integer, Integer> elementCountMap = new HashMap<>();
        
        // // Iterate through the input array to count element occurrences
        // for (int i = 0; i < nums.length; i++) {
        //     elementCountMap.put(nums[i], elementCountMap.getOrDefault(nums[i], 0) + 1);
        // }
        
        // List<Integer> majorityElements = new ArrayList<>();
        // int threshold = nums.length / 3;
        
        // // Iterate through the frequency map to identify majority elements
        // for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
        //     int element = entry.getKey();
        //     int count = entry.getValue();
            
        //     // Check if the element count is greater than the threshold
        //     if (count > threshold) {
        //         majorityElements.add(element);
        //     }
        // }
        
        // return majorityElements;

        
        //Boyers Moores Voting Algo T:O(n) S:O(1)
        
        int count1 = 0, count2 = 0; // Counters for the potential majority elements
        int candidate1 = 0, candidate2 = 0; // Potential majority element candidates

        // First pass to find potential majority elements.
        for (int i = 0; i < nums.length; i++) {
            // If count1 is 0 and the current number is not equal to candidate2, update candidate1.
            if (count1 == 0 && nums[i] != candidate2) {
                count1 = 1;
                candidate1 = nums[i];
            } 
            // If count2 is 0 and the current number is not equal to candidate1, update candidate2.
            else if (count2 == 0 && nums[i] != candidate1) {
                count2 = 1;
                candidate2 = nums[i];
            } 
            // Update counts for candidate1 and candidate2.
            else if (candidate1 == nums[i]) {
                count1++;
            } else if (candidate2 == nums[i]) {
                count2++;
            } 
            // If the current number is different from both candidates, decrement their counts.
            else {
                count1--;
                count2--;
            }
        }

        List<Integer> result = new ArrayList<>();
        int threshold = nums.length / 3; // Threshold for majority element

        // Second pass to count occurrences of the potential majority elements.
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (candidate1 == nums[i]) {
                count1++;
            } else if (candidate2 == nums[i]) {
                count2++;
            }
        }

        // Check if the counts of potential majority elements are greater than n/3 and add them to the result.
        if (count1 > threshold) {
            result.add(candidate1);
        }
        if (count2 > threshold) {
            result.add(candidate2);
        }

        return result;
    }

    public static void main(String[] args) {
        int nums[] = {3,2,3};

        System.out.println(majorityElement(nums));
    }
}
