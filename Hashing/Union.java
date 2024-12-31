
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Union {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[]){
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        
        for(int val : arr1){
            set.add(val);
        }
        for(int val : arr2){
            set.add(val);
        }

        for(int val : set){
            ans.add(val);
        }

        return ans;

    }
    public static void main(String[] args) {
        int[] arr1 = {7,3,9};
        int[] arr2 = {6,3,9,2,9,4};

        System.out.println(findUnion(arr1, arr2));

    }
}
