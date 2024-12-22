public class CountSubString {

    // Count number of substrings exist in string
    // By sliding window
    public static int count(String st, String sub){//O(n^2)
        int count = 0;

        int str = 0, end = sub.length()-1;
        while(end < st.length()){
            int sub_p = 0;
            int ch_count = 0;
            for(int i=str; i<=end; i++){
                if(st.charAt(i) != sub.charAt(sub_p)){
                    break;
                }
                else{
                    ch_count++;
                }
                if(ch_count == sub.length()){
                    count++;
                }
                sub_p++;
            }

            str++;
            end++;
        }

        return count;
    }
    public static void main(String[] args) {
        String st = "aaaaba";
        String sub = "aba";
        System.out.println(count(st, sub));
    }
}
