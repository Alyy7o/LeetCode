

public class pairSum{
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,6,7};
        int target = 7;

        // Brute Force Time: O(n^2) 
        // for(int i=0; i<arr.length-1;){
        //     for(int j=i+1; j<arr.length;){
        //         if(arr[i] + arr[j] == target){
        //             System.out.println("Sum of Numbers Exist at index: " + i + " and " + j );
        //         }
        //         j++;
        //     }
        //     i++;
        // }
        
        
        // Optimized Method Time: O(n)
        // As we are using array which is sorted and using only one loop to find pair sum 
        int i=0, j=arr.length-1;

        while ( i < j) { 
            if(arr[i] + arr[j] == target){
                System.out.println("Sum of Numbers Exist at index: " + i + " and " + j );
                break;
            }
            else if(arr[i] + arr[j] > target){
                j--;
            }
            else if(arr[i] + arr[j] < target){
                i++;
            }
        }
    }

}