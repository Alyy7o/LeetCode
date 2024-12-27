public class RemoveConsectiveChar {
    public static String removeConsecutiveCharacter(String s) {// Time: O(n)
        // code here
        StringBuilder str = new StringBuilder(s);
        int fr = 0, sec = 1;
        while(sec < str.length()){
            if(str.charAt(fr) == str.charAt(sec)){
                str.deleteCharAt(sec);
            }
            else{
                fr++;
                sec++;
            }
        }

        s = new String(str);
        return s;
    }
    public static void main(String[] args) {
        String s = "abcddcba";
        System.out.println(removeConsecutiveCharacter(s));
    }
}
