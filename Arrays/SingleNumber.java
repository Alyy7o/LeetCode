public class SingleNumber {

    public int number(int nums[]){
        int ans = 0;

        for(int val:nums){
            ans ^= val;
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {4,1,2,1,2};

        SingleNumber singleNumber = new SingleNumber();

        System.out.println(singleNumber.number(nums));
    }
}
