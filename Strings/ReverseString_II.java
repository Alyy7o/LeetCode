public class ReverseString_II {
    public static String reverseStr(String s, int k){
        
        char[] ch = s.toCharArray();
        
        if(s == "" || k == 0){
            return s;
        }

        if(k >= s.length()){
            int str = 0, end = s.length()-1;
            while(str < end){
                char temp = ch[str];
                ch[str] = ch[end];
                ch[end] = temp;

                str++;
                end--;
            }
        }
        
        else{
            int str = 0, end = k-1;
            while(end <= s.length()-1){
                int f = str;
                int sec = end;
                while(f < sec){
                    char temp = ch[f];
                    ch[f] = ch[sec];
                    ch[sec] = temp;

                    f++;
                    sec--;
                }

                str += (2 * k);
                end += (2 * k);
            }
        }
        s = new String(ch);
        return s;
    }
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 8;
        System.out.println(reverseStr(s, k));
    }
}
