import com.sun.source.tree.BinaryTree;
import java.util.*;
public class LL {

    public static void reorderList(LinkedList<Integer> list){
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        LinkedList<Integer> new_list = new LinkedList();

        for(int val : list){
            arr.add(list.get(val));
        }

        int str = 0, end = arr.size()-1, i = 0;

        while(i < arr.size()){
            ans.add(i, arr.get(str));
            str++;
            i++;

            if(str >= end){
                break;
            }

            ans.add(i, arr.get(end));
            end--;
            i++;
        }


        new_list.addAll(ans);
        System.out.println(new_list);
        
    }

    public static void addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        int n1 = 0;
        int n2 = 0;
        
        for(int i=l1.size()-1; i>=0; i--){
            n1 = n1 * 10 + l1.get(i);
        }
        for(int i=l2.size()-1; i>=0; i--){
            n2 = n2 * 10 + l2.get(i);
        }

        int sum = n1 + n2;

        String st = String.valueOf(sum);
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=st.length()-1; i >= 0; i--){
            arr.add(st.charAt(i) - '0'); //char to int
        }

        LinkedList<Integer> ll = new LinkedList<>();
        ll.addAll(arr);

        System.out.println(ll);
    }


    public static int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i < nums.length; i++){
            if(set.contains(nums[i])){
                return nums[i];
            }

            set.add(nums[i]);
        }

        return -1;
    }



    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        // list1.add(0);
        // list1.add(1);
        // list1.add(2);
        // list1.add(3);

        // list2.add(4);
        // list2.add(5);
        // list2.add(6);

        // // reorderList(list);
        // addTwoNumbers(list1, list2);

        int[] nums = {1,2,3,2,2};
        System.out.println(findDuplicate(nums));
        
        
    }
}
